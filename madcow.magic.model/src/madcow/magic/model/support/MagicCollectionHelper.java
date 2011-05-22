package madcow.magic.model.support;

import java.util.logging.Logger;

import madcow.magic.collection.CardCondition;
import madcow.magic.collection.CardInstance;
import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionElement;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.Container;
import madcow.magic.collection.Deck;
import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.core.Database;

import org.eclipse.emf.common.util.EList;

public final class MagicCollectionHelper {


	public static int initializeCollElementFromCSV(CollectionElement element, EList<EList<String>> values, int index) {
		
		EList<String> line = values.get(index);
		//setId(line.get(1).trim());
		if(1 < line.size()){
			element.setName(line.get(1).trim());
		}
		if(2 < line.size()){
			element.setOwner(line.get(2).trim());
		}
		if(3 < line.size()){
			element.setDescription(line.get(3).trim());
		}
		return index;
	}
	
	public static int initializeCollFromCSV(Collection collection, EList<EList<String>> values, int index) {
		
		index = initializeCollElementFromCSV(collection, values, index);
		
		index++;
		
		while(index < values.size() && 0 < values.get(index).size()){
			EList<String> nextline = values.get(index);
			
			if(nextline.get(0).equals("CONT")){
				Container c = CollectionFactory.eINSTANCE.createContainer();
				c.setCollection(collection);
				index = MagicCollectionHelper.initializeContainerFromCSV(c, values, index);
			} else if(nextline.get(0).equals("DECK")){
				Deck d = CollectionFactory.eINSTANCE.createDeck();
				d.setCollection(collection);
				index = MagicCollectionHelper.initializeDeckFromCSV(d, values, index);
			} else break;
		}
		
		return index;
	}

	public static int initializeContainerFromCSV(Container container, EList<EList<String>> values, int index) {
		
		index = initializeCollElementFromCSV(container, values, index);
		Database db = container.getCollection().getDatabase();
		
		EList<String> line = values.get(index);
		if(4 < line.size()){
			container.setPlace(line.get(4).trim());
		}
		index++;
		
		while(index < values.size() && 0 < values.get(index).size()){
			EList<String> nextline = values.get(index);
			if(0 < nextline.size()){
				String string = nextline.get(0);
				if(string.equals("DECK") || string.equals("CONT") || string.equals("COLL"))
					return index;
			}
			
			if(1 < nextline.size()){
				String setId = nextline.get(0).trim();
				String card = nextline.get(1).trim();
				
				CardInstance ci = CollectionFactory.eINSTANCE.createCardInstance();
				try {
					int number = Integer.parseInt(card);
					Card c = MagicDatabaseHelper.findCardByNumberAndSetId(db, number, setId);
					ci.setCard(c);
					ci.setName(c.getName());
					container.getCards().add(ci);
				} catch (NumberFormatException e) {
					// TODO alter logging to internal logger
					Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Card is not identified by number, rying as name");
					Card c = MagicDatabaseHelper.findCardByNameAndSetId(db, card, setId);
					ci.setCard(c);
					ci.setName(c.getName());
					container.getCards().add(ci);
				}
				
				if(2 < nextline.size()){
					String condition = nextline.get(2).trim();
					if(CardCondition.get(condition) != null)
						ci.setCondition(CardCondition.get(condition));
					else 
						ci.setCondition(CardCondition.EXCELLENT);
				}
				if(3 < nextline.size()){
					String foil = nextline.get(3).trim();
					if(foil.equals("1"))
						ci.setFoil(true);
					else 
						ci.setFoil(false);
				}
				if(4 < nextline.size()){
					String proxy = nextline.get(4).trim();
					if(proxy.equals("1"))
						ci.setProxy(true);
					else 
						ci.setProxy(false);
				}
			}
			
			index++;
		}
		
		return index;
	}
	
	public static int initializeDeckFromCSV(Deck deck, EList<EList<String>> values, int index) {
		
		index = initializeContainerFromCSV(deck, values, index);
		
		return index;
	}
	
}
