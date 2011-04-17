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
package madcow.magic.importer.db;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.DatabasePackage;
import madcow.magic.importer.util.CSVFileReader;
import madcow.magic.model.support.MagicCollectionHelper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * @author Ábel Hegedüs
 *
 */
public class MagicCollectionImporter {
	EList<EList<String>> values = null;
	Database database = null;
	Resource resource = null;
	private Collection collection;
	
	/**
	 * Creates a new Magic Database EMF model from the contents of the file
	 * 
	 * @param fileName the CSV file to import
	 */
	public MagicCollectionImporter(String fileName, String databaseFileName, String collFileName) {
		CSVFileReader reader = openFile(fileName);
		createNewCollectionFromFile(reader, databaseFileName, collFileName);
	}
	
	/**
	 * Appends the contents of the file to the existing EMF model
	 * 
	 * @param filename the CSV file to append
	 * @param model the existing Magic DB EMF model
	 */
	public MagicCollectionImporter(String filename, Collection model) {
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
	
	private void createNewCollectionFromFile(CSVFileReader cfr, String databaseFile, String collFileName){
		
		int index = 0;
		
		if(cfr == null){
			return;
		}
	
		//EcoreUtil.setEList(values, cfr.getValues());
		values = cfr.getValues();
		
		if(0 < values.size()){
			List<String> header = values.get(0);
			
			if(header.isEmpty() || !header.get(0).equals("COLL")){
				return;
			}
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("mdb", new XMIResourceFactoryImpl());
			m.put("mc", new XMIResourceFactoryImpl());
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getPackageRegistry().put
			(DatabasePackage.eNS_URI, DatabasePackage.eINSTANCE);
			resourceSet.getPackageRegistry().put
			(CollectionPackage.eNS_URI, CollectionPackage.eINSTANCE);
			URI fileURI = URI.createFileURI(databaseFile);
			resource = resourceSet.createResource(fileURI);
			try {
				resource.load(null);
			} catch (IOException e) {
				// TODO alter logging to internal logger
				Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).warning("Database load failed");
				e.printStackTrace();
			}
			database = (Database) resource.getContents().get(0);
			
			if (database == null) {
				//resource.getContents().add(database);
				return;
				
			}
			
			collection = CollectionFactory.eINSTANCE.createCollection();
			collection.setDatabase(database);
			fileURI = URI.createFileURI(collFileName);
			Resource collResource = resourceSet.createResource(fileURI);
			collResource.getContents().add(collection);
			collResource.getContents().add(database);
			index = MagicCollectionHelper.initializeCollFromCSV(collection, values, 0);
			
			//Map<Object, Object> options = new HashMap<Object, Object>();
			//options.put(XMLResource.OPTION_ENCODING, );
			try {
				collResource.save(null);
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
	
	
	public static void main(String args[]){
		
		String collCSVFileName = "j:\\J (Data)\\Decks\\myCollection.csv"; 
		String collFileName = "j:\\J (Data)\\Decks\\MyCollection.mc"; 
		String databaseFileName = "j:\\J (Data)\\Decks\\Complete.mdb"; 
		//String cardCSVFileName = "j:\\J (Data)\\Decks\\mbs.csv"; 
		//String cardCSVFolder = "j:\\J (Data)\\Decks\\sets"; 
		
		new MagicCollectionImporter(collCSVFileName, databaseFileName, collFileName);
		
	}
}
