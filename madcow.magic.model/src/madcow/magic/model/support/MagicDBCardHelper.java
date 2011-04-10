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

import java.util.StringTokenizer;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import madcow.magic.database.card.Card;
import madcow.magic.database.card.Creature;
import madcow.magic.database.card.ManaType;
import madcow.magic.database.card.RarityType;
import madcow.magic.database.core.CardCSVFields;

/**
 * 
 * @author Ábel Hegedüs
 *
 */
public final class MagicDBCardHelper {

	/**
	 * 
	 * @param card
	 * @param typeString
	 * @return
	 */
	public static boolean parseType(Card card, String typeString) {
		
		boolean result = false;
		
		if(typeString.contains("Legendary")){
			card.setLegendary(true);
		}
		if(typeString.contains("Tribal")){
			card.setTribal(true);
		}
		
		int separatorIndex = typeString.indexOf('-');
		if(0 > separatorIndex)
			separatorIndex = typeString.indexOf('—');
		if(0 < separatorIndex){
			String firstPart = typeString.substring(0, separatorIndex).trim();
			if(null != firstPart && !"".equals(firstPart)){
				card.setTypeString(firstPart);
				result = true;
			}
			String secondPart = typeString.substring(separatorIndex+1).trim();
			if(null != secondPart && !"".equals(secondPart)){
				card.setSubtype(secondPart);
				result = true;
			}
		} else{
			if(0 < typeString.length()){
				card.setTypeString(typeString);
				result = true;
			}
		}
		
		return result;
	}
	
	public static boolean parseManaCost(Card card, String manaCostString) {

		boolean result = false;
		int converted = 0;
		
		if(null != manaCostString){
			card.setManacostString(manaCostString);
		}
		while(!"".equals(manaCostString)){
			ManaType next = null;
			int amount = 1;
			if(manaCostString.startsWith(ManaType.WHITE.getLiteral())){
				next = ManaType.WHITE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLUE.getLiteral())){
				next = ManaType.BLUE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLACK.getLiteral())){
				next = ManaType.BLACK;
				converted++;
			} else if(manaCostString.startsWith(ManaType.RED.getLiteral())){
				next = ManaType.RED;
				converted++;
			} else if(manaCostString.startsWith(ManaType.GREEN.getLiteral())){
				next = ManaType.GREEN;
				converted++;
			} else if(manaCostString.startsWith(ManaType.WHITE_BLUE.getLiteral())){
				next = ManaType.WHITE_BLUE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLUE_BLACK.getLiteral())){
				next = ManaType.BLUE_BLACK;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLACK_RED.getLiteral())){
				next = ManaType.BLACK_RED;
				converted++;
			} else if(manaCostString.startsWith(ManaType.RED_GREEN.getLiteral())){
				next = ManaType.RED_GREEN;
				converted++;
			} else if(manaCostString.startsWith(ManaType.GREEN_WHITE.getLiteral())){
				next = ManaType.GREEN_WHITE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.WHITE_BLACK.getLiteral())){
				next = ManaType.WHITE_BLACK;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLUE_RED.getLiteral())){
				next = ManaType.BLUE_RED;
				converted++;
			} else if(manaCostString.startsWith(ManaType.BLACK_GREEN.getLiteral())){
				next = ManaType.BLACK_GREEN;
				converted++;
			} else if(manaCostString.startsWith(ManaType.RED_WHITE.getLiteral())){
				next = ManaType.RED_WHITE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.GREEN_BLUE.getLiteral())){
				next = ManaType.GREEN_BLUE;
				converted++;
			} else if(manaCostString.startsWith(ManaType.TWO_WHITE.getLiteral())){
				next = ManaType.TWO_WHITE;
				converted += 2;
			} else if(manaCostString.startsWith(ManaType.TWO_BLUE.getLiteral())){
				next = ManaType.TWO_BLUE;
				converted += 2;
			} else if(manaCostString.startsWith(ManaType.TWO_BLACK.getLiteral())){
				next = ManaType.TWO_BLACK;
				converted += 2;
			} else if(manaCostString.startsWith(ManaType.TWO_RED.getLiteral())){
				next = ManaType.TWO_RED;
				converted += 2;
			} else if(manaCostString.startsWith(ManaType.TWO_GREEN.getLiteral())){
				next = ManaType.TWO_GREEN;
				converted += 2;
			} else if(manaCostString.startsWith(ManaType.MANY.getLiteral())){
				next = ManaType.MANY;
			} else
				try{
					if (-1 < Integer.parseInt(manaCostString.substring(0, 1))) {
						next = ManaType.COLORLESS;
						amount = Integer.parseInt(manaCostString
								.substring(0, 1));
						if(0 < amount)
							converted += amount;
					}
				} catch (NumberFormatException e) {
					next = ManaType.OTHER;
				}
			if(null != next){
				card.getManacost().add(next);
				if(1 < amount){
					for (int i = 1; i < amount; i++) {
						card.getManacost().add(next);
					}
				}
				if(next != ManaType.OTHER){
					manaCostString = manaCostString.substring(next.getLiteral().length());
				} else {
					break;
				}
			}
		}
		card.setConvertedManaCost(converted);
		
		if(0 < card.getManacost().size())
			result = true;
		
		return result;
	}
	
	public static int initializeCardFromCSV(Card card, EList<EList<String>> values, int index) {
		index = MagicDatabaseHelper.initializeMagicElementFromCSV(card, values, index);
		//setDescription("");
		EList<String> line = values.get(index);
		try {
			card.setNumber(Integer.parseInt(line.get(CardCSVFields.NUMBER_VALUE).trim()));
			card.setName(line.get(CardCSVFields.NAME_VALUE).trim());
			if(!MagicDBCardHelper.parseType(card, line.get(CardCSVFields.TYPE_VALUE).trim())){
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Type not formatted correctly");
			}
			if(!MagicDBCardHelper.parseManaCost(card, line.get(CardCSVFields.MANA_COST_VALUE).trim())){
				if(null == card.getManacostString()){
					Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Mana cost not formatted correctly");
				}
			}
			card.setRarity(RarityType.get(line.get(CardCSVFields.RARITY_VALUE).trim()));
			card.setArtist(line.get(CardCSVFields.ARTIST_VALUE).trim());
			if(CardCSVFields.SET_VALUE < line.size()){
				card.setDescription(line.get(CardCSVFields.SET_VALUE).trim());
			}
		} catch (NumberFormatException e) {
			// TODO alter logging to internal logger
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Number not formatted correctly " + e.getMessage());
		} catch (Exception e) {
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Unknown error occurred");
			e.printStackTrace();
		}
		
		return index + 1;
	}
	
	public static int initializeCreatureFromCSV(Creature cr, EList<EList<String>> values, int index) {
		int result = initializeCardFromCSV(cr, values, index);
		
		// super.init successful
		if(result > index){
			String typeStringToProcess = null;
			// subtype contains power and toughness
			if(null != cr.getSubtype() && !"".equals(cr.getSubtype())){
				typeStringToProcess = cr.getSubtype();
			} // type contains power and toughness
			else if(null != cr.getTypeString() && !"".equals(cr.getTypeString())){
				typeStringToProcess = cr.getTypeString();
			}
			StringTokenizer st = new StringTokenizer(typeStringToProcess, " ");
			if(0 < st.countTokens())
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				int tIndex = 0;
				if(0 < (tIndex = token.indexOf('/'))){
					String powerS = token.substring(0, tIndex).trim();
					String toughS = token.substring(tIndex+1, token.length());
					try{
						if(!powerS.contains("*")){
							cr.setPower(Integer.parseInt(powerS));
						} else {
							cr.setPower(-1);
						}
						if(!toughS.contains("*")){
							cr.setToughness(Integer.parseInt(toughS));
						} else {
							cr.setToughness(-1);
						}
					} catch (NumberFormatException e) {
						// TODO alter logging to internal logger
						Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Creature P/S not formatted correctly " + e.getMessage());
					}
				}
			}
		}
		
		return result;
	}
	
}
