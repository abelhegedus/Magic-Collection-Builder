/*******************************************************************************
 * Copyright (c) 2001-2011 Mad Cow Entertainment and Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ábel Hegedüs - initial API and implementation
 *******************************************************************************/
package madcow.magic.model.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import madcow.magic.database.card.Card;
import madcow.magic.database.card.Creature;
import madcow.magic.database.card.ManaType;
import madcow.magic.database.card.RarityType;
import madcow.magic.database.core.CardCSVFields;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.MagicDBElement;
import madcow.magic.database.set.Block;
import madcow.magic.database.set.BlockType;
import madcow.magic.database.set.Set;
import madcow.magic.database.set.SetFactory;

import org.eclipse.emf.common.util.EList;

/**
 * 
 * @author Ábel Hegedüs
 *
 */
public final class MagicDatabaseHelper {

	public static int initializeMagicElementFromCSV(MagicDBElement mdbelement, EList<EList<String>> values, int index) {
		EList<String> line = values.get(index);
		//setId(line.get(1).trim());
		if(2 < line.size()){
			mdbelement.setName(line.get(2).trim());
		}
		if(3 < line.size()){
			mdbelement.setDescription(line.get(3).trim());
		}
		return index;
	}
	
	public static int initializeBlockFromCSV(Block block, EList<EList<String>> values, int index) {
		index = initializeMagicElementFromCSV(block, values, index);
		
		EList<String> line = values.get(index);
		block.setId(line.get(1).trim());
		if(4 < line.size()){
			block.setType(BlockType.get(line.get(4).trim()));
		}
		index++;
		
		while(index < values.size() && 0 < values.get(index).size()){
			EList<String> setline = values.get(index);
			
			if(setline.get(0).equals("SET")){
				Set set = SetFactory.eINSTANCE.createSet();
				block.getSets().add(set);
				index = MagicDatabaseHelper.initializeSetFromCSV(set, values, index);
			} else break;
		}
		
		return index;
	}
	
	public static int initializeSetFromCSV(Set set, EList<EList<String>> values, int index) {
		index = initializeMagicElementFromCSV(set, values, index);
		
		EList<String> line = values.get(index);
		set.setId(line.get(1).trim());
		try {
			if(4 < line.size()){
				DateFormat df = new SimpleDateFormat("mm/yyyy");
				set.setDate(df.parse(line.get(4).trim()));
			}
		} catch (ParseException e) {
			// TODO alter logging to internal logger
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Date not formatted correctly");
		}
		try {
			if(5 < line.size()){
				set.setCardTotal(Integer.parseInt(line.get(5).trim()));
			}
		} catch (NumberFormatException e) {
			// TODO alter logging to internal logger
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Number not formatted correctly");
		}
		return index+1;
	}
	
	public static int initializeDBFromCSV(Database db, EList<EList<String>> values, int index) {
		index = initializeMagicElementFromCSV(db, values, index)+1;
		
		while(index < values.size() && 0 < values.get(index).size()){
			EList<String> line = values.get(index);
			
			if(line.get(0).equals("BLOCK")){
				Block block = SetFactory.eINSTANCE.createBlock();
				db.getBlocks().add(block);
				index = MagicDatabaseHelper.initializeBlockFromCSV(block, values, index);
			}
			
		}
		
		return index;
	}
	
	public static Card findCardByName(Database db, String cardName) {
		
		Card result = null;
		
		for (Block block : db.getBlocks()) {
			for (Set set : block.getSets()) {
				for (Card card : set.getCards()) {
					if (card.getName().equals(cardName)) {
						if(null == card.getOriginalCard()){
							result = card;
						} else {
							result = card.getOriginalCard();
						}
						return result;
					}
				}
			}
		}
		
		return result;
	}
	
	public static Card findCardByNumberAndSetId(Database db, String cardNumber, String setId) {
		
		Card result = null;
		Set set = findSetById(db, setId);
		
		if(null != set){
			for (Card card : set.getCards()) {
				if (cardNumber.equals(card.getNumber())) {
					result = card;
					return result;
				}
			}
		}
		return result;
	}
	
	public static Set findSetByName(Database db, String setName) {

		Set result = null;
		
		for (Block block : db.getBlocks()) {
			for (Set set : block.getSets()) {
				if(set.getName().equals(setName)){
					result = set;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static Set findSetById(Database db, String setId) {

		Set result = null;
		
		for (Block block : db.getBlocks()) {
			for (Set set : block.getSets()) {
				if(setId.equals(set.getId())){
					result = set;
					break;
				}
			}
		}
		
		return result;
	}
}
