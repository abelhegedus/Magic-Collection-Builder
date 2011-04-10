package madcow.magic.importer.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import madcow.magic.database.card.Artifact;
import madcow.magic.database.card.ArtifactCreature;
import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardFactory;
import madcow.magic.database.card.Creature;
import madcow.magic.database.card.Enchancement;
import madcow.magic.database.card.Instant;
import madcow.magic.database.card.Interrupt;
import madcow.magic.database.card.Land;
import madcow.magic.database.card.Planeswalker;
import madcow.magic.database.card.Sorcery;
import madcow.magic.database.core.CardCSVFields;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.DatabaseFactory;
import madcow.magic.database.set.Block;
import madcow.magic.database.set.Set;
import madcow.magic.importer.util.CSVFileReader;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MagicDatabaseImporter {

	EList<EList<String>> values = null;
	Database database = null;
	Resource resource = null;
	
	/**
	 * Creates a new Magic Database EMF model from the contents of the file
	 * 
	 * @param filename the CSV file to import
	 */
	public MagicDatabaseImporter(String filename) {
		CSVFileReader reader = openFile(filename);
		createNewDatabaseFromFile(reader);
	}
	
	/**
	 * Creates a new Magic Database EMF model from the contents of the file
	 * 
	 * @param setFile the set CSV file to import
	 * @param cardFolder the cards CSV file to import
	 */
	public MagicDatabaseImporter(String setFile, String cardFolder) {
		CSVFileReader reader = openFile(setFile);
		createNewDatabaseFromFile(reader);
		
		CSVFileReader cardreader = openFolder(cardFolder);
		insertCardsToDatabase(cardreader, database);
	}
	
	
	public Database getDatabase() {
		return database;
	}

	/**
	 * Appends the contents of the file to the existing EMF model
	 * 
	 * @param filename the CSV file to append
	 * @param model the existing Magic DB EMF model
	 */
	public MagicDatabaseImporter(String filename, Database model) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Opens the file for reading
	 * 
	 * @param filename the file to be opened
	 * @return the input stream to read from
	 */
	private CSVFileReader openFile(String filename) {
		
		CSVFileReader cfr = new CSVFileReader(filename);
		cfr.setFileName(filename);
		cfr.readFile();

		return cfr;

	}
	
	/**
	 * Opens the folder for reading
	 * 
	 * @param foldername the file to be opened
	 * @return the input stream to read from
	 */
	private CSVFileReader openFolder(String foldername) {
		
		CSVFileReader cfr = new CSVFileReader(foldername);
		cfr.setFolderName(foldername);
		cfr.readFolder();

		return cfr;

	}
	
	private void createNewDatabaseFromFile(CSVFileReader cfr){
		
		int index = 0;
		
		if(cfr == null){
			return;
		}
	
		//EcoreUtil.setEList(values, cfr.getValues());
		values = cfr.getValues();
		
		if(0 < values.size()){
			List<String> header = values.get(0);
			
			if(header.isEmpty() || !header.get(0).equals("MDB")){
				return;
			}
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("mdb", new XMIResourceFactoryImpl());
			ResourceSet resourceSet = new ResourceSetImpl();
			URI fileURI = URI.createFileURI("j:/J (Data)/Decks/Complete.mdb");
			resource = resourceSet.createResource(fileURI);
			
			database = DatabaseFactory.eINSTANCE.createDatabase();
			
			if (database != null) {
				resource.getContents().add(database);
			}
			
			index = database.initializeFromCSV(values, 0);
			
			//Map<Object, Object> options = new HashMap<Object, Object>();
			//options.put(XMLResource.OPTION_ENCODING, );
			try {
				resource.save(null);
			} catch (IOException e) {
				// TODO alter logging to internal logger
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Save failed");
				e.printStackTrace();
			}
			
			if(index < values.size()){
				// TODO alter logging to internal logger
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Not all lines processed");
			}
		}
		
	}
	
	private void insertCardsToDatabase(CSVFileReader cfr, Database db){
		
		if(null != cfr && null != resource && null != database &&
				resource.getContents().get(0).equals(database)){
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Database correct");
		} else {
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Database not found");
			return;
		}
		
		//Set toSortSet = SetFactory.eINSTANCE.createSet();
		List<Card> toSortSet = new BasicEList<Card>();
		//toSortSet.setId("toSortSet");
		//toSortSet.setName("Unsorted Cards");
		//Block toSortBlock = SetFactory.eINSTANCE.createBlock();
		//toSortBlock.setId("toSortBlock");
		//toSortBlock.setName("Unsorted Cards");
		//toSortBlock.getSets().add(toSortSet);
		//database.getBlocks().add(toSortBlock);
		
		int index = 0;
		values = cfr.getValues();
		while(index < values.size()){
				 
			List<String> line = values.get(index);
			if(line.isEmpty()){// || !line.get(0).equals("CARD")){
				return;
			}
			//Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Inserting Card: " + line.get(2));

			String type = line.get(CardCSVFields.TYPE_VALUE).trim();
			if(null == type){
				Card card = CardFactory.eINSTANCE.createCard();
				index = card.initializeFromCSV(values, index);
				toSortSet.add(card);
			} else if(type.contains("Instant")){
				Instant instant = CardFactory.eINSTANCE.createInstant();
				index = instant.initializeFromCSV(values, index);
				toSortSet.add(instant);
			} else if(type.contains("Sorcery")){
				Sorcery sorcery = CardFactory.eINSTANCE.createSorcery();
				index = sorcery.initializeFromCSV(values, index);
				toSortSet.add(sorcery);
			} else if(type.contains("Planeswalker")){
				Planeswalker pw = CardFactory.eINSTANCE.createPlaneswalker();
				index = pw.initializeFromCSV(values, index);
				toSortSet.add(pw);
			} else if(type.contains("Enchant")){
				Enchancement en = CardFactory.eINSTANCE.createEnchancement();
				index = en.initializeFromCSV(values, index);
				toSortSet.add(en);
			} else if(type.contains("Interrupt")){
				Interrupt in = CardFactory.eINSTANCE.createInterrupt();
				index = in.initializeFromCSV(values, index);
				toSortSet.add(in);
			} else if(type.contains("Land")){
				Land l = CardFactory.eINSTANCE.createLand();
				index = l.initializeFromCSV(values, index);
				toSortSet.add(l);
			} else if(type.contains("Artifact Creature")){
				ArtifactCreature ac = CardFactory.eINSTANCE.createArtifactCreature();
				index = ac.initializeFromCSV(values, index);
				toSortSet.add(ac);
			} else if(type.contains("Artifact")){
				Artifact a = CardFactory.eINSTANCE.createArtifact();
				index = a.initializeFromCSV(values, index);
				toSortSet.add(a);
			} else if(type.contains("Creature") || type.contains("Summon")){
				Creature c = CardFactory.eINSTANCE.createCreature();
				index = c.initializeFromCSV(values, index);
				toSortSet.add(c);
			} else if(!"".equals(type)){ 
				Card card = CardFactory.eINSTANCE.createCard();
				index = card.initializeFromCSV(values, index);
				toSortSet.add(card);
			} else {
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Unknown card type");
				index++;
			}

		}
		
		if(0 < toSortSet.size()){
			database.setCardTotal(toSortSet.size());
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Number of cards to sort: " + toSortSet.size());
		}
		
		sortCardsIntoSets(toSortSet);
		
		if(0 < toSortSet.size()){
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Number of unsorted cards: " + toSortSet.size());
		}
		
		for (Block b : database.getBlocks()) {
			
			for (Set s : b.getSets()) {
				if(s.getCards().size() != s.getCardTotal()){
					Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Block: " + b.getName() +
							" >> Set: " + s.getName()+ "\n   NOGO - Missing " + 
							(s.getCardTotal()- s.getCards().size()) + "/" + s.getCards().size() + " cards (Total: " + s.getCardTotal() + ").");
					List<Integer> missing = new ArrayList<Integer>();
					for(int i = 1; i <= s.getCardTotal(); i++ ){missing.add(i);}
					for(Card c : s.getCards()){
						Integer i = new Integer(c.getNumber());
						missing.remove(i);
					}
					if(0 < missing.size())
						Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("   Missing card IDs " + missing.toString());
				} else {
					//Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("   GO - All cards found.");
				}
			}
		}
		
		try {
			resource.save(null);
		} catch (IOException e) {
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Save failed");
			e.printStackTrace();
		}
				
	}
	
	private void sortCardsIntoSets(List<Card> toSortSet) {
		
		List<Card> cards = new BasicEList<Card>();
		cards.addAll(toSortSet);
		
		for (Card card : cards) {
			String setName = card.getDescription();
			if(null != setName && !setName.equals("")){
				Card existingCard = database.findCardByName(card.getName());
				if(addCard(card, existingCard)){
					//insertCardIntoSet(setName, card);
					toSortSet.remove(card);
				}
			}
		}
		
		return;
	}
	
	/*private boolean insertCardIntoSet(String setName, Card card) {
		Set earliest = null;
		Set newSet = database.findSetByName(setName);
		if(null == newSet){
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Set not found " + setName);
			return false;
		}
		for (Set set : card.getSet()) {
			if(null == earliest || earliest.getDate().after(set.getDate())){
				earliest = set;
			}
			if(set.equals(newSet)){
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Card already in DB");
				return false;
			}
		}
		if(null != earliest){ 
			if(newSet.getDate().after(earliest.getDate())){
				newSet.getReprints().add(card);
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Add as reprint " + card.getName());
			} else {
				earliest.getCards().remove(card);
				newSet.getCards().add(card);
				earliest.getReprints().add(card);
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Move to set " + card.getName());
			}
		} else {
			newSet.getCards().add(card);
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Add as original " + card.getName());
		}
		return true;
	}*/
	
	private boolean addCard(Card newCard, Card existingCard){
		Set existingSet = null;
		if(null != existingCard){
			// set for existing card without Original
			existingSet = existingCard.getSet();
			// check existence of set
			if(null == existingSet){
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Original set not found");
				return false;
			}
		}
		
		// find set by name for new card
		Set newSet = database.findSetByName(newCard.getDescription());
		if(null == newSet){
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("New set not found " + newCard.getDescription());
			return false;
		}
		newSet.getCards().add(newCard);
		if(null != existingSet){
			// decide which set is earlier
			if(null == existingSet.getDate() || (null != newSet.getDate() && existingSet.getDate().after(newSet.getDate()))){
				if(existingCard.getName().equals(newCard.getName())){
					// existing card is newer
					existingCard.setOriginalCard(newCard);
				} else {
					System.out.println("WTF?");
				}
				//Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Add as original " + newCard.getName());
			} else {
				if(existingCard.getName().equals(newCard.getName())){
					// existing card is older
					newCard.setOriginalCard(existingCard);
				} else {
					System.out.println("WTF?");
				}
				//Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).info("Added as reprint " + newCard.getName());
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		
		String setCSVFileName = "j:\\J (Data)\\Decks\\blocks.csv"; 
		//String cardCSVFileName = "j:\\J (Data)\\Decks\\mbs.csv"; 
		String cardCSVFolder = "j:\\J (Data)\\Decks\\sets"; 
		
		MagicDatabaseImporter mdi = new MagicDatabaseImporter(setCSVFileName, cardCSVFolder);
		mdi.getDatabase().toString();
		
	}
	
}
