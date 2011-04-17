package madcow.magic.model.support;

import java.util.logging.Logger;

import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionElement;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.Container;
import madcow.magic.collection.Deck;
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
				try {
					int number = Integer.parseInt(card);
					container.getCards().add(MagicDatabaseHelper.findCardByNumberAndSetId(db, number, setId));
				} catch (NumberFormatException e) {
					// TODO alter logging to internal logger
					Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Card is not identified by number, rying as name");
					container.getCards().add(MagicDatabaseHelper.findCardByNameAndSetId(db, card, setId));
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
