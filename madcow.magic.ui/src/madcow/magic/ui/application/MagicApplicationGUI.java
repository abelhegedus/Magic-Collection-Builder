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
package madcow.magic.ui.application;

import java.io.IOException;
import java.util.Map;

import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardFactory;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.card.RarityType;
import madcow.magic.database.core.Database;
import madcow.magic.database.core.DatabaseFactory;
import madcow.magic.database.core.DatabasePackage;
import madcow.magic.database.set.Block;
import madcow.magic.database.set.Set;
import madcow.magic.database.set.SetFactory;
import madcow.magic.database.set.SetPackage;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.conversion.NumberToStringConverter;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.BorderLayout;
import swing2swt.layout.BoxLayout;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.jface.viewers.ListViewer;

/**
 * 
 * @author Ábel Hegedüs
 *
 */
public class MagicApplicationGUI {
	

	private DataBindingContext m_bindingContext;
	
	protected Shell shlMagicCollectionBuilder;
	private Text cardName;
	private Text types;
	private Text power;
	private Text toughness;
	private Text expansion;
	private Text number;
	private Text artist;
	private Text cardText;
	private Text flavorText;
	
	private Resource databaseResource;
	private Database database = DatabaseFactory.eINSTANCE.createDatabase();
	private Block selBlock = SetFactory.eINSTANCE.createBlock();
	private Set selSet = SetFactory.eINSTANCE.createSet();
	private Card selCard = CardFactory.eINSTANCE.createCard();
	private Label dbTotal;
	private Table table;
	private TableViewer cardViewer;
	private ComboViewer blockViewer;
	private ComboViewer setViewer;
	private Text manaCost;
	private Text convertedManaCost;
	private Text subTypes;

	private ListViewer otherSetsViewer;

	private ComboViewer rarityViewer;

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMagicCollectionBuilder.open();
		shlMagicCollectionBuilder.layout();
		while (!shlMagicCollectionBuilder.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMagicCollectionBuilder = new Shell();
		shlMagicCollectionBuilder.setSize(513, 542);
		shlMagicCollectionBuilder.setText("Magic Collection Builder");
		shlMagicCollectionBuilder.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite.setLayoutData(BorderLayout.NORTH);
		composite.setLayout(new GridLayout(2, false));
		
		Label lblNumberOfCards = new Label(composite, SWT.NONE);
		lblNumberOfCards.setText("Number of cards in Database: ");
		
		dbTotal = new Label(composite, SWT.NONE);
		GridData gd_dbTotal = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_dbTotal.widthHint = 57;
		dbTotal.setLayoutData(gd_dbTotal);
		dbTotal.setText("0");
		
		TabFolder tabFolder = new TabFolder(shlMagicCollectionBuilder, SWT.NONE);
		
		TabItem tbtmDatabase = new TabItem(tabFolder, SWT.NONE);
		tbtmDatabase.setText("Database");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmDatabase.setControl(composite_2);
		composite_2.setLayout(new BorderLayout(0, 0));
		
		Composite composite_4 = new Composite(composite_2, SWT.NONE);
		composite_4.setLayoutData(BorderLayout.NORTH);
		composite_4.setLayout(new GridLayout(2, false));
		
		Label lblSet = new Label(composite_4, SWT.NONE);
		lblSet.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSet.setText("Block:");
		
		blockViewer = new ComboViewer(composite_4, SWT.NONE);
		Combo blockCombo = blockViewer.getCombo();
		GridData gd_blockCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_blockCombo.widthHint = 151;
		blockCombo.setLayoutData(gd_blockCombo);
		blockCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection s = (IStructuredSelection)blockViewer.getSelection();
				if(s.getFirstElement() instanceof Block){
					selBlock = (Block) s.getFirstElement();
				}
			}
		});
		
		Label lblSet_1 = new Label(composite_4, SWT.NONE);
		lblSet_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSet_1.setText("Set:");
		
		setViewer = new ComboViewer(composite_4, SWT.NONE);
		Combo setCombo = setViewer.getCombo();
		GridData gd_setCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_setCombo.widthHint = 151;
		setCombo.setLayoutData(gd_setCombo);
		setCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection s = (IStructuredSelection)setViewer.getSelection();
				if(s.getFirstElement() instanceof Set){
					selSet = (Set) s.getFirstElement();
				}
			}
		});
		
		Composite composite_6 = new Composite(composite_2, SWT.NONE);
		composite_6.setLayoutData(BorderLayout.CENTER);
		composite_6.setLayout(new GridLayout(1, false));
		
		cardViewer = new TableViewer(composite_6, SWT.BORDER | SWT.FULL_SELECTION);
		table = cardViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TabItem tbtmCollections = new TabItem(tabFolder, SWT.NONE);
		tbtmCollections.setText("Collections");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmCollections.setControl(composite_3);
		composite_3.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		Composite composite_1 = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.SOUTH);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblMad = new Label(composite_1, SWT.NONE);
		lblMad.setAlignment(SWT.RIGHT);
		lblMad.setText("\u00A9 2001-2011 Mad Cow Entertainment & Corporation");
		
		Menu menu = new Menu(shlMagicCollectionBuilder, SWT.BAR);
		shlMagicCollectionBuilder.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmNew = new MenuItem(menu_1, SWT.NONE);
		mntmNew.setText("New...");
		
		MenuItem mntmOpen = new MenuItem(menu_1, SWT.NONE);
		mntmOpen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(shlMagicCollectionBuilder);
				fd.setFilterExtensions(new String[]{"*.mdb","*.mc","*.csv"});
				fd.setText("Open File...");
				//fd.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
				String result = fd.open();
				if(null != result && result.endsWith(".mdb")){
					Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
					Map<String, Object> m = reg.getExtensionToFactoryMap();
					m.put("mdb", new XMIResourceFactoryImpl());
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getPackageRegistry().put
					(DatabasePackage.eNS_URI, DatabasePackage.eINSTANCE);
					URI fileURI = URI.createFileURI(result);
					databaseResource = resourceSet.createResource(fileURI);
					try {
						databaseResource.load(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(0 < databaseResource.getContents().size() && databaseResource.getContents().get(0) instanceof Database){
						database = (Database)databaseResource.getContents().get(0);
						dbTotal.setText("" + database.getCardTotal());
						initEMFBinding();
						/*for(Block b : database.getBlocks()){
							blockCombo.add(b.getName());
						}*/
						//setCombo.setItems();					
					}
				}
			}
		});
		mntmOpen.setText("Open File...");
		
		MenuItem mntmSave = new MenuItem(menu_1, SWT.NONE);
		mntmSave.setText("Save");
		
		MenuItem mntmExit = new MenuItem(menu_1, SWT.NONE);
		mntmExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMagicCollectionBuilder.dispose();
			}
		});
		mntmExit.setText("Exit");
		
		MenuItem mntmOptions = new MenuItem(menu, SWT.CASCADE);
		mntmOptions.setText("Options");
		
		Menu menu_3 = new Menu(mntmOptions);
		mntmOptions.setMenu(menu_3);
		
		MenuItem mntmLanguage = new MenuItem(menu_3, SWT.NONE);
		mntmLanguage.setText("Language");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_2 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_2);
		
		MenuItem mntmHelpContents = new MenuItem(menu_2, SWT.NONE);
		mntmHelpContents.setText("Help Contents");
		
		MenuItem mntmAbout = new MenuItem(menu_2, SWT.NONE);
		mntmAbout.setText("About");
		
		Composite composite_5 = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite_5.setLayoutData(BorderLayout.EAST);
		composite_5.setLayout(new GridLayout(2, false));
		
		Label lblName = new Label(composite_5, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Card Name:");
		
		cardName = new Text(composite_5, SWT.BORDER);
		GridData gd_cardName = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_cardName.widthHint = 114;
		cardName.setLayoutData(gd_cardName);
		
		Label lblNumber = new Label(composite_5, SWT.NONE);
		lblNumber.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumber.setText("Mana Cost:");
		
		manaCost = new Text(composite_5, SWT.BORDER);
		manaCost.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblType = new Label(composite_5, SWT.NONE);
		lblType.setFont(SWTResourceManager.getFont("Segoe UI", 7, SWT.NORMAL));
		GridData gd_lblType = new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1);
		gd_lblType.heightHint = 15;
		lblType.setLayoutData(gd_lblType);
		lblType.setText("Converted Mana Cost:");
		
		convertedManaCost = new Text(composite_5, SWT.BORDER);
		GridData gd_convertedManaCost = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
		gd_convertedManaCost.widthHint = 28;
		convertedManaCost.setLayoutData(gd_convertedManaCost);
		
		Label lblTypes = new Label(composite_5, SWT.NONE);
		lblTypes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTypes.setText("Types:");
		
		types = new Text(composite_5, SWT.BORDER);
		types.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblSubtypes = new Label(composite_5, SWT.NONE);
		lblSubtypes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSubtypes.setText("Subtype:");
		
		subTypes = new Text(composite_5, SWT.BORDER);
		subTypes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCardText = new Label(composite_5, SWT.NONE);
		lblCardText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCardText.setText("Card Text:");
		
		cardText = new Text(composite_5, SWT.BORDER | SWT.MULTI);
		cardText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		new Label(composite_5, SWT.NONE);
		
		Label lblFlavorText = new Label(composite_5, SWT.NONE);
		lblFlavorText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlavorText.setText("Flavor Text:");
		
		flavorText = new Text(composite_5, SWT.BORDER);
		flavorText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPt = new Label(composite_5, SWT.NONE);
		lblPt.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPt.setText("P/T:");
		
		Composite composite_7 = new Composite(composite_5, SWT.NONE);
		composite_7.setLayout(new RowLayout(SWT.HORIZONTAL));
		GridData gd_composite_7 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite_7.widthHint = 127;
		gd_composite_7.heightHint = 24;
		composite_7.setLayoutData(gd_composite_7);
		
		power = new Text(composite_7, SWT.BORDER);
		power.setLayoutData(new RowData(20, SWT.DEFAULT));
		
		Label label_2 = new Label(composite_7, SWT.NONE);
		label_2.setText("/");
		
		toughness = new Text(composite_7, SWT.BORDER);
		toughness.setLayoutData(new RowData(20, SWT.DEFAULT));
		
		Label lblExpansion = new Label(composite_5, SWT.NONE);
		lblExpansion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExpansion.setText("Expansion:");
		
		expansion = new Text(composite_5, SWT.BORDER);
		expansion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblRarity = new Label(composite_5, SWT.NONE);
		lblRarity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRarity.setText("Rarity:");
		
		rarityViewer = new ComboViewer(composite_5, SWT.NONE);
		Combo rarity = rarityViewer.getCombo();
		rarity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblOtherSets = new Label(composite_5, SWT.NONE);
		lblOtherSets.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOtherSets.setText("Other Sets:");
		
		otherSetsViewer = new ListViewer(composite_5, SWT.BORDER | SWT.V_SCROLL);
		List otherSets = otherSetsViewer.getList();
		otherSets.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNumber_1 = new Label(composite_5, SWT.NONE);
		lblNumber_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumber_1.setText("Card #:");
		
		number = new Text(composite_5, SWT.BORDER);
		number.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblArtist = new Label(composite_5, SWT.NONE);
		lblArtist.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblArtist.setText("Artist:");
		
		artist = new Text(composite_5, SWT.BORDER);
		artist.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}
	
	private void initEMFBinding(){
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		initBlockSelectionBinding();
		
		initSetSelectionBinding();
		
		initCardSelectionBinding();
		
		UpdateValueStrategy updateStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_UPDATE);
		UpdateValueStrategy requestStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_ON_REQUEST);
		UpdateValueStrategy updateNumberStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_UPDATE);
		updateNumberStrategy.setConverter(NumberToStringConverter.fromInteger(false));
		UpdateValueStrategy requestNumberStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_ON_REQUEST);
		requestNumberStrategy.setConverter(StringToNumberConverter.toInteger(false));
		
		// card details binding
		IObservableValue cardSelection = ViewersObservables.observeSingleSelection(cardViewer);
		
		IEMFValueProperty pName = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		dbc.bindValue(SWTObservables.observeText(cardName, SWT.Modify),
				pName.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pMana = EMFProperties.value(CardPackage.Literals.CARD__MANACOST_STRING);
		dbc.bindValue(SWTObservables.observeText(manaCost, SWT.Modify),
				pMana.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pConvertedMana = EMFProperties.value(CardPackage.Literals.CARD__CONVERTED_MANA_COST);
		dbc.bindValue(SWTObservables.observeText(convertedManaCost, SWT.Modify),
				pConvertedMana.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pTypes = EMFProperties.value(CardPackage.Literals.CARD__TYPE_STRING);
		dbc.bindValue(SWTObservables.observeText(types, SWT.Modify),
				pTypes.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pSubTypes = EMFProperties.value(CardPackage.Literals.CARD__SUBTYPE);
		dbc.bindValue(SWTObservables.observeText(subTypes, SWT.Modify),
				pSubTypes.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pText = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__DESCRIPTION);
		dbc.bindValue(SWTObservables.observeText(cardText, SWT.Modify),
				pText.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		//IEMFValueProperty pFlavor = EMFProperties.value(CardPackage.Literals.CARD__MANACOST_STRING);
		IEMFValueProperty pPower = EMFProperties.value(CardPackage.Literals.CREATURE__POWER);
		dbc.bindValue(SWTObservables.observeText(power, SWT.Modify),
				pPower.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pToughness = EMFProperties.value(CardPackage.Literals.CREATURE__TOUGHNESS);
		dbc.bindValue(SWTObservables.observeText(toughness, SWT.Modify),
				pToughness.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pExpansion = EMFProperties.value(FeaturePath.fromList(CardPackage.Literals.CARD__SET, DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME));
		dbc.bindValue(SWTObservables.observeText(expansion, SWT.Modify),
				pExpansion.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pNumber = EMFProperties.value(CardPackage.Literals.CARD__NUMBER);
		dbc.bindValue(SWTObservables.observeText(number, SWT.Modify),
				pNumber.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pArtist = EMFProperties.value(CardPackage.Literals.CARD__ARTIST);
		dbc.bindValue(SWTObservables.observeText(artist, SWT.Modify),
				pArtist.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IObservableList raritys = EMFObservables.observeList(CardPackage.Literals.RARITY_TYPE, EcorePackage.Literals.EENUM__ELITERALS); 
		IEMFValueProperty pRarityName = EMFProperties.value(EcorePackage.Literals.EENUM_LITERAL__LITERAL);
		ViewerSupport.bind(rarityViewer, raritys, pRarityName);
		
		UpdateValueStrategy updateEnumStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_UPDATE);
		updateEnumStrategy.setConverter(new RarityTypeToEEnumLiteralConverter(RarityType.class,EEnumLiteral.class));
		UpdateValueStrategy requestEnumStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_ON_REQUEST);
		requestEnumStrategy.setConverter(new EEnumLiteralToRarityTypeConverter(EEnumLiteral.class,RarityType.class));
		
		IValueProperty raritySelection = ViewerProperties.singleSelection();
		IEMFValueProperty pRarity = EMFProperties.value(CardPackage.Literals.CARD__RARITY);
		dbc.bindValue(raritySelection.observe(rarityViewer),
				pRarity.observeDetail(cardSelection), requestEnumStrategy, updateEnumStrategy);
		
		IEMFListProperty pExpansionList = EMFProperties.multiList(CardPackage.Literals.CARD__REPRINTS, CardPackage.Literals.CARD__ORIGINAL_CARD);
		IObservableList sets = pExpansionList.observeDetail(cardSelection);
		IEMFValueProperty pExpansionName = EMFProperties.value(FeaturePath.fromList(CardPackage.Literals.CARD__SET,DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME));
		ViewerSupport.bind(otherSetsViewer, sets, pExpansionName);
	}

	private void initCardSelectionBinding() {
		// card list table binding
		IObservableValue setSelection = ViewersObservables.observeSingleSelection(setViewer);
		IEMFListProperty pCardList = EMFProperties.list(SetPackage.Literals.SET__CARDS);
		IObservableList cards = pCardList.observeDetail(setSelection);
		IEMFValueProperty pCardName = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		ViewerSupport.bind(cardViewer, cards, pCardName);
	}

	private void initSetSelectionBinding() {
		// set selection combo box binding
		IObservableValue blockSelection = ViewersObservables.observeSingleSelection(blockViewer);
		IEMFListProperty pSetList = EMFProperties.list(SetPackage.Literals.BLOCK__SETS);
		IObservableList sets = pSetList.observeDetail(blockSelection);
		IEMFValueProperty pSetName = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		ViewerSupport.bind(setViewer, sets, pSetName);
	}

	private void initBlockSelectionBinding() {
		// block selection combo box binding
		WritableList blocks = new WritableList(database.getBlocks(), Block.class);
		IEMFValueProperty pBlockName = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		ViewerSupport.bind(blockViewer, blocks, pBlockName);
	}
	
	private final class DummyValidator implements IValidator {
		@Override
		public IStatus validate(Object value) {
			// TODO Auto-generated method stub
			
			System.out.print(value.toString() + " : ");
			System.out.println(value.getClass().toString());
			return Status.OK_STATUS;
		}
	}

	private final class EEnumLiteralToRarityTypeConverter extends Converter {
		
		public EEnumLiteralToRarityTypeConverter(Object fromType, Object toType) {
			super(fromType, toType);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Object getToType() {
			// TODO Auto-generated method stub
			return RarityType.class;
		}

		@Override
		public Object getFromType() {
			// TODO Auto-generated method stub
			return EEnumLiteral.class;
		}

		@Override
		public Object convert(Object fromObject) {

			if(fromObject instanceof EEnumLiteral)
				return RarityType.get(((EEnumLiteral) fromObject).getLiteral());
			return null;
		}
	}

	private final class RarityTypeToEEnumLiteralConverter extends Converter {
		
		public RarityTypeToEEnumLiteralConverter(Object fromType, Object toType) {
			super(fromType, toType);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Object getToType() {
			// TODO Auto-generated method stub
			return EEnumLiteral.class;
		}

		@Override
		public Object getFromType() {
			// TODO Auto-generated method stub
			return RarityType.class;
		}

		@Override
		public Object convert(Object fromObject) {

			if(fromObject instanceof RarityType)
				return CardPackage.Literals.RARITY_TYPE.getEEnumLiteral(((RarityType) fromObject).getLiteral());
			else return "";
		}
	}
}
