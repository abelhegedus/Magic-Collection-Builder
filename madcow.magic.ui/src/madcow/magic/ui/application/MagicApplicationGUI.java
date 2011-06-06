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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import madcow.magic.collection.CardInstance;
import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.collection.Container;
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
import madcow.magic.model.support.MagicDatabaseHelper;
import madcow.magic.ui.locale.MagicLocales;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.conversion.NumberToStringConverter;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
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
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.BorderLayout;

import com.swtdesigner.ResourceManager;
import com.swtdesigner.SWTResourceManager;
import com.swtdesigner.TableViewerColumnSorter;

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
	
	private boolean collSelected = false;
	
	private Resource databaseResource;
	private Database database = DatabaseFactory.eINSTANCE.createDatabase();
	private Collection collection = CollectionFactory.eINSTANCE.createCollection();
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
	
	private Map<Card, Image> card2imageMap = new HashMap<Card, Image>();

	private ListViewer otherSetsViewer;

	private ComboViewer rarityViewer;
	private Text insertNum;
	private Label collName;
	private Label owner;
	private Label desc;
	private ComboViewer containers;
	private Text insertSetId;
	private Button cbFoil;
	private Button cbProxy;
	private MenuItem mntmMoveTo;

	private Menu menu_6;
	private MenuItem online;
	private Label image;

	private Card empty;

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
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
		shlMagicCollectionBuilder.setSize(800, 850);
		shlMagicCollectionBuilder.setText(MagicLocales.MagicApplicationGUI_shlMagicCollectionBuilder_text);
		shlMagicCollectionBuilder.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite.setLayoutData(BorderLayout.NORTH);
		composite.setLayout(new GridLayout(8, false));
		
		Label lblNumberOfCards = new Label(composite, SWT.NONE);
		lblNumberOfCards.setText(MagicLocales.MagicApplicationGUI_lblNumberOfCards_text);
		
		dbTotal = new Label(composite, SWT.NONE);
		GridData gd_dbTotal = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_dbTotal.widthHint = 46;
		dbTotal.setLayoutData(gd_dbTotal);
		dbTotal.setText("0");
		
		Label lblLoadedCollection = new Label(composite, SWT.NONE);
		lblLoadedCollection.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblLoadedCollection.setText(MagicLocales.MagicApplicationGUI_lblLoadedCollection_text);
		
		collName = new Label(composite, SWT.NONE);
		GridData gd_collName = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_collName.widthHint = 74;
		collName.setLayoutData(gd_collName);
		collName.setText(MagicLocales.MagicApplicationGUI_label_text);
		
		Label lblowner = new Label(composite, SWT.NONE);
		lblowner.setText(MagicLocales.MagicApplicationGUI_lblowner_text);
		
		owner = new Label(composite, SWT.NONE);
		GridData gd_owner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_owner.widthHint = 57;
		owner.setLayoutData(gd_owner);
		owner.setText(MagicLocales.MagicApplicationGUI_label_text_2);
		
		Label lblDescription = new Label(composite, SWT.NONE);
		lblDescription.setText(MagicLocales.MagicApplicationGUI_lblDescription_text);
		
		desc = new Label(composite, SWT.NONE);
		GridData gd_desc = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_desc.widthHint = 133;
		desc.setLayoutData(gd_desc);
		desc.setText(MagicLocales.MagicApplicationGUI_label_text_3);
		
		Composite composite_1 = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.SOUTH);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblMad = new Label(composite_1, SWT.NONE);
		lblMad.setAlignment(SWT.RIGHT);
		lblMad.setText(MagicLocales.MagicApplicationGUI_lblMad_text);
		
		Menu menu = new Menu(shlMagicCollectionBuilder, SWT.BAR);
		shlMagicCollectionBuilder.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText(MagicLocales.MagicApplicationGUI_mntmFile_text);
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmNew_1 = new MenuItem(menu_1, SWT.CASCADE);
		mntmNew_1.setText(MagicLocales.MagicApplicationGUI_mntmNew_1_text);
		
		Menu menu_4 = new Menu(mntmNew_1);
		mntmNew_1.setMenu(menu_4);
		
		MenuItem mntmDatabase = new MenuItem(menu_4, SWT.NONE);
		mntmDatabase.addSelectionListener(new NewDatabaseSelectionAdapter());
		mntmDatabase.setText(MagicLocales.MagicApplicationGUI_mntmNew_text);
		
		MenuItem mntmBlock = new MenuItem(menu_4, SWT.NONE);
		mntmBlock.addSelectionListener(new NewBlockSelectionAdapter());
		mntmBlock.setText(MagicLocales.MagicApplicationGUI_mntmContainer_text);
		
		MenuItem mntmSet = new MenuItem(menu_4, SWT.NONE);
		mntmSet.addSelectionListener(new NewSetSelectionAdapter());
		mntmSet.setText(MagicLocales.MagicApplicationGUI_mntmSet_text);
		
		MenuItem mntmCollection = new MenuItem(menu_4, SWT.NONE);
		mntmCollection.addSelectionListener(new NewCollectionSelectionAdapter());
		mntmCollection.setText(MagicLocales.MagicApplicationGUI_mntmCollection_text);
		
		MenuItem mntmDeck = new MenuItem(menu_4, SWT.NONE);
		mntmDeck.addSelectionListener(new NewDeckSelectionAdapter());
		mntmDeck.setText(MagicLocales.MagicApplicationGUI_mntmDeck_text);
		
		MenuItem mntmOpen = new MenuItem(menu_1, SWT.NONE);
		mntmOpen.addSelectionListener(new OpenFileSelectionAdapter());
		mntmOpen.setText(MagicLocales.MagicApplicationGUI_mntmOpen_text);
		
		MenuItem mntmSave = new MenuItem(menu_1, SWT.NONE);
		mntmSave.addSelectionListener(new SaveSelectionAdapter());
		mntmSave.setText(MagicLocales.MagicApplicationGUI_mntmSave_text);
		
		MenuItem mntmExit = new MenuItem(menu_1, SWT.NONE);
		mntmExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMagicCollectionBuilder.dispose();
			}
		});
		mntmExit.setText(MagicLocales.MagicApplicationGUI_mntmExit_text);
		
		MenuItem mntmOptions = new MenuItem(menu, SWT.CASCADE);
		mntmOptions.setText(MagicLocales.MagicApplicationGUI_mntmOptions_text);
		
		Menu menu_3 = new Menu(mntmOptions);
		mntmOptions.setMenu(menu_3);
		
		MenuItem mntmPreferences = new MenuItem(menu_3, SWT.NONE);
		mntmPreferences.addSelectionListener(new PreferencesSelectionAdapter());
		mntmPreferences.setText(MagicLocales.MagicApplicationGUI_mntmLanguage_text);
		
		online = new MenuItem(menu_3, SWT.CHECK);
		online.setText(MagicLocales.MagicApplicationGUI_mntmOnline_text);
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText(MagicLocales.MagicApplicationGUI_mntmHelp_text);
		
		Menu menu_2 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_2);
		
		MenuItem mntmHelpContents = new MenuItem(menu_2, SWT.NONE);
		mntmHelpContents.setText(MagicLocales.MagicApplicationGUI_mntmHelpContents_text);
		
		MenuItem mntmAbout = new MenuItem(menu_2, SWT.NONE);
		mntmAbout.setText(MagicLocales.MagicApplicationGUI_mntmAbout_text);
		
		Composite composite_5 = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite_5.setLayoutData(BorderLayout.EAST);
		composite_5.setLayout(new GridLayout(3, false));
		new Label(composite_5, SWT.NONE);
		
		Label lblName = new Label(composite_5, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText(MagicLocales.MagicApplicationGUI_lblName_text);
		
		cardName = new Text(composite_5, SWT.BORDER);
		GridData gd_cardName = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_cardName.widthHint = 114;
		cardName.setLayoutData(gd_cardName);
		new Label(composite_5, SWT.NONE);
		
		Label lblNumber = new Label(composite_5, SWT.NONE);
		lblNumber.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumber.setText(MagicLocales.MagicApplicationGUI_lblNumber_text);
		
		manaCost = new Text(composite_5, SWT.BORDER);
		manaCost.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblType = new Label(composite_5, SWT.NONE);
		lblType.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		GridData gd_lblType = new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1);
		gd_lblType.heightHint = 15;
		lblType.setLayoutData(gd_lblType);
		lblType.setText(MagicLocales.MagicApplicationGUI_lblType_text);
		
		convertedManaCost = new Text(composite_5, SWT.BORDER);
		GridData gd_convertedManaCost = new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1);
		gd_convertedManaCost.widthHint = 28;
		convertedManaCost.setLayoutData(gd_convertedManaCost);
		new Label(composite_5, SWT.NONE);
		
		Label lblTypes = new Label(composite_5, SWT.NONE);
		lblTypes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTypes.setText(MagicLocales.MagicApplicationGUI_lblTypes_text);
		
		types = new Text(composite_5, SWT.BORDER);
		types.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblSubtypes = new Label(composite_5, SWT.NONE);
		lblSubtypes.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSubtypes.setText(MagicLocales.MagicApplicationGUI_lblSubtypes_text);
		
		subTypes = new Text(composite_5, SWT.BORDER);
		subTypes.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblCardText = new Label(composite_5, SWT.NONE);
		lblCardText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCardText.setText(MagicLocales.MagicApplicationGUI_lblCardText_text);
		
		cardText = new Text(composite_5, SWT.BORDER | SWT.MULTI);
		cardText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		new Label(composite_5, SWT.NONE);
		new Label(composite_5, SWT.NONE);
		new Label(composite_5, SWT.NONE);
		
		Label lblFlavorText = new Label(composite_5, SWT.NONE);
		lblFlavorText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFlavorText.setText(MagicLocales.MagicApplicationGUI_lblFlavorText_text);
		
		flavorText = new Text(composite_5, SWT.BORDER);
		flavorText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblPt = new Label(composite_5, SWT.NONE);
		lblPt.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPt.setText(MagicLocales.MagicApplicationGUI_lblPt_text);
		
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
		new Label(composite_5, SWT.NONE);
		
		Label lblExpansion = new Label(composite_5, SWT.NONE);
		lblExpansion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExpansion.setText(MagicLocales.MagicApplicationGUI_lblExpansion_text);
		
		expansion = new Text(composite_5, SWT.BORDER);
		expansion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblRarity = new Label(composite_5, SWT.NONE);
		lblRarity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblRarity.setText(MagicLocales.MagicApplicationGUI_lblRarity_text);
		
		rarityViewer = new ComboViewer(composite_5, SWT.NONE);
		Combo rarity = rarityViewer.getCombo();
		rarity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblOtherSets = new Label(composite_5, SWT.NONE);
		lblOtherSets.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOtherSets.setText(MagicLocales.MagicApplicationGUI_lblOtherSets_text);
		
		otherSetsViewer = new ListViewer(composite_5, SWT.BORDER | SWT.V_SCROLL);
		List otherSets = otherSetsViewer.getList();
		otherSets.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_5, SWT.NONE);
		
		Label lblNumber_1 = new Label(composite_5, SWT.NONE);
		lblNumber_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumber_1.setText(MagicLocales.MagicApplicationGUI_lblNumber_1_text);
		
		number = new Text(composite_5, SWT.BORDER);
		number.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label = new Label(composite_5, SWT.NONE);
		GridData gd_label = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_label.widthHint = 54;
		label.setLayoutData(gd_label);
		label.setText(MagicLocales.MagicApplicationGUI_label_text_4);
		
		Label lblArtist = new Label(composite_5, SWT.NONE);
		lblArtist.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblArtist.setText(MagicLocales.MagicApplicationGUI_lblArtist_text);
		
		artist = new Text(composite_5, SWT.BORDER);
		artist.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		image = new Label(composite_5, SWT.NONE);
		image.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		image.setText(MagicLocales.MagicApplicationGUI_image_text);
		Image i = ResourceManager.getPluginImage("madcow.magic.ui", "images/back.jpg");
		empty = CardFactory.eINSTANCE.createCard();
		card2imageMap.put(empty, i);
		
		Composite composite_8 = new Composite(shlMagicCollectionBuilder, SWT.NONE);
		composite_8.setLayoutData(BorderLayout.CENTER);
		composite_8.setLayout(new BorderLayout(0, 0));
		
		TabFolder tabFolder = new TabFolder(composite_8, SWT.NONE);
		tabFolder.addSelectionListener(new TabSelectionAdapter());
		tabFolder.setLayoutData(BorderLayout.NORTH);
		
		TabItem tbtmDatabase = new TabItem(tabFolder, SWT.NONE);
		tbtmDatabase.setText(MagicLocales.MagicApplicationGUI_tbtmDatabase_text);
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmDatabase.setControl(composite_2);
		composite_2.setLayout(new BorderLayout(0, 0));
		
		Composite composite_4 = new Composite(composite_2, SWT.NONE);
		composite_4.setLayoutData(BorderLayout.CENTER);
		composite_4.setLayout(new GridLayout(2, false));
		
		Label lblSet = new Label(composite_4, SWT.NONE);
		lblSet.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSet.setText(MagicLocales.MagicApplicationGUI_lblSet_text);
		
		blockViewer = new ComboViewer(composite_4, SWT.NONE);
		Combo blockCombo = blockViewer.getCombo();
		GridData gd_blockCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_blockCombo.widthHint = 151;
		blockCombo.setLayoutData(gd_blockCombo);
		blockCombo.addSelectionListener(new BlockSelectionAdapter());
		
		Label lblSet_1 = new Label(composite_4, SWT.NONE);
		lblSet_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSet_1.setText(MagicLocales.MagicApplicationGUI_lblSet_1_text);
		
		setViewer = new ComboViewer(composite_4, SWT.NONE);
		Combo setCombo = setViewer.getCombo();
		GridData gd_setCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_setCombo.widthHint = 151;
		setCombo.setLayoutData(gd_setCombo);
		setCombo.addSelectionListener(new SetSelectionAdapter());
		
		TabItem tbtmCollections = new TabItem(tabFolder, SWT.NONE);
		tbtmCollections.setText(MagicLocales.MagicApplicationGUI_tbtmCollections_text);
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmCollections.setControl(composite_3);
		composite_3.setLayout(new BorderLayout(0, 0));
		
		Composite composite_9 = new Composite(composite_3, SWT.NONE);
		composite_9.setLayoutData(BorderLayout.CENTER);
		composite_9.setLayout(new GridLayout(7, false));
		
		Label lblContainers = new Label(composite_9, SWT.NONE);
		lblContainers.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblContainers.setText(MagicLocales.MagicApplicationGUI_lblContainers_text);
		
		containers = new ComboViewer(composite_9, SWT.NONE);
		Combo combo = containers.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		new Label(composite_9, SWT.NONE);
		new Label(composite_9, SWT.NONE);
		new Label(composite_9, SWT.NONE);
		
		Label lblNumbername = new Label(composite_9, SWT.NONE);
		lblNumbername.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumbername.setText(MagicLocales.MagicApplicationGUI_lblNumbername_text);
		
		insertNum = new Text(composite_9, SWT.BORDER);
		GridData gd_insertNum = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_insertNum.widthHint = 50;
		insertNum.setLayoutData(gd_insertNum);
		
		Label lblExpansion_1 = new Label(composite_9, SWT.NONE);
		lblExpansion_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExpansion_1.setText(MagicLocales.MagicApplicationGUI_lblExpansion_1_text);
		
		insertSetId = new Text(composite_9, SWT.BORDER);
		insertSetId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		cbFoil = new Button(composite_9, SWT.CHECK);
		cbFoil.setText(MagicLocales.MagicApplicationGUI_cbFoil_text);
		
		Composite composite_10 = new Composite(composite_9, SWT.NONE);
		composite_10.setLayout(new GridLayout(1, false));
		
		cbProxy = new Button(composite_10, SWT.CHECK);
		cbProxy.setText(MagicLocales.MagicApplicationGUI_cbProxy_text);
		
		Button btnInsert = new Button(composite_9, SWT.NONE);
		btnInsert.addSelectionListener(new InsertSelectionAdapter());
		btnInsert.setText(MagicLocales.MagicApplicationGUI_btnInser_text);
		
		Composite composite_6 = new Composite(composite_8, SWT.NONE);
		composite_6.setLayoutData(BorderLayout.CENTER);
		composite_6.setLayout(new GridLayout(1, false));
		
		cardViewer = new TableViewer(composite_6, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		cardViewer.setColumnProperties(new String[] {});
		cardViewer.addSelectionChangedListener(new CardSelectionChangedListener());
		
		table = cardViewer.getTable();
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(cardViewer, SWT.NONE);
		new CardTableColumnSorter(tableViewerColumn);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(226);
		tblclmnName.setText(MagicLocales.MagicApplicationGUI_tblclmnName_text);
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(cardViewer, SWT.NONE);
		new CardTableColumnSorter(tableViewerColumn_1);
		TableColumn tblclmnNumber = tableViewerColumn_1.getColumn();
		tblclmnNumber.setWidth(47);
		tblclmnNumber.setText(MagicLocales.MagicApplicationGUI_tblclmnNumber_text);
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(cardViewer, SWT.NONE);
		new CardTableColumnSorter(tableViewerColumn_2);
		TableColumn tblclmnType = tableViewerColumn_2.getColumn();
		tblclmnType.setWidth(147);
		tblclmnType.setText(MagicLocales.MagicApplicationGUI_tblclmnType_text);
		
		Menu menu_5 = new Menu(table);
		table.setMenu(menu_5);
		
		MenuItem mDelete = new MenuItem(menu_5, SWT.NONE);
		mDelete.addSelectionListener(new DeleteSelectionAdapter());
		mDelete.setText(MagicLocales.MagicApplicationGUI_mDelete_text);
		
		mntmMoveTo = new MenuItem(menu_5, SWT.NONE);
		mntmMoveTo.addSelectionListener(new MoveSelectionAdapter());
		mntmMoveTo.setText(MagicLocales.MagicApplicationGUI_mntmMoveTo_1_text);
		
		MenuItem mntmDuplicate = new MenuItem(menu_5, SWT.NONE);
		mntmDuplicate.addSelectionListener(new DuplicateSelectionAdapter());
		mntmDuplicate.setText(MagicLocales.MagicApplicationGUI_mntmDuplicate_text);
		
	}
	
	private void initEMFBinding(){
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		initBlockSelectionBinding();
		
		initSetSelectionBinding();
		
		initCardSelectionBinding();
		
		initCardInfoBinding(dbc);
		
	}

	/**
	 * @param dbc
	 */
	private void initCardInfoBinding(EMFDataBindingContext dbc) {
		
		// card details binding
		IObservableValue cardSelection = ViewersObservables.observeSingleSelection(cardViewer);
		
		initCollectionViewer();
		
		initCardInfoTextBinding(dbc, cardSelection);
		
		initCardInfoNumberBinding(dbc, cardSelection);
		
		initCardInfoEnumBinding(dbc, cardSelection);
		
	}

	/**
	 * @param dbc
	 * @param cardSelection
	 * @param collCardSelection 
	 */
	private void initCardInfoEnumBinding(EMFDataBindingContext dbc,
			IObservableValue cardSelection) {
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

	/**
	 * @param dbc
	 * @param cardSelection
	 * @param collCardSelection 
	 */
	private void initCardInfoTextBinding(EMFDataBindingContext dbc,
			IObservableValue cardSelection) {
		UpdateValueStrategy updateStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_UPDATE);
		UpdateValueStrategy requestStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_ON_REQUEST);
		
		IEMFValueProperty pName = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		dbc.bindValue(SWTObservables.observeText(cardName, SWT.Modify),
				pName.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pMana = EMFProperties.value(CardPackage.Literals.CARD__MANACOST_STRING);
		dbc.bindValue(SWTObservables.observeText(manaCost, SWT.Modify),
				pMana.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pTypes = EMFProperties.value(CardPackage.Literals.CARD__TYPE_STRING);
		dbc.bindValue(SWTObservables.observeText(types, SWT.Modify),
				pTypes.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pSubTypes = EMFProperties.value(CardPackage.Literals.CARD__SUBTYPE);
		dbc.bindValue(SWTObservables.observeText(subTypes, SWT.Modify),
				pSubTypes.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pText = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__DESCRIPTION);
		dbc.bindValue(SWTObservables.observeText(cardText, SWT.Modify),
				pText.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pExpansion = EMFProperties.value(FeaturePath.fromList(CardPackage.Literals.CARD__SET, DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME));
		dbc.bindValue(SWTObservables.observeText(expansion, SWT.Modify),
				pExpansion.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IEMFValueProperty pArtist = EMFProperties.value(CardPackage.Literals.CARD__ARTIST);
		dbc.bindValue(SWTObservables.observeText(artist, SWT.Modify),
				pArtist.observeDetail(cardSelection), requestStrategy, updateStrategy);
		
		IObservableList raritys = EMFObservables.observeList(CardPackage.Literals.RARITY_TYPE, EcorePackage.Literals.EENUM__ELITERALS); 
		IEMFValueProperty pRarityName = EMFProperties.value(EcorePackage.Literals.EENUM_LITERAL__LITERAL);
		ViewerSupport.bind(rarityViewer, raritys, pRarityName);
		
		//IEMFValueProperty pFlavor = EMFProperties.value(CardPackage.Literals.CARD__MANACOST_STRING);
		//UpdateValueStrategy updateStrategyTemp = new UpdateValueStrategy(true,
		//		UpdateValueStrategy.POLICY_UPDATE);
		//updateStrategyTemp.setAfterGetValidator(new DummyValidator());
		//updateStrategyTemp.setAfterConvertValidator(new DummyValidator());
		//updateStrategyTemp.setBeforeSetValidator(new DummyValidator());
		//IEMFValueProperty pFlavor = EMFProperties.value(
		//		FeaturePath.fromList(EcorePackage.Literals.ETYPED_ELEMENT__ETYPE,
		//		EcorePackage.Literals.ENAMED_ELEMENT__NAME));
		//dbc.bindValue(SWTObservables.observeText(flavorText, SWT.Modify),
		//		pFlavor.observeDetail(cardSelection), requestStrategy, updateStrategyTemp);
	}	

	/**
	 * @param dbc
	 * @param cardSelection
	 * @param collCardSelection 
	 */
	private void initCardInfoNumberBinding(EMFDataBindingContext dbc,
			IObservableValue cardSelection) {
		UpdateValueStrategy updateNumberStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_UPDATE);
		updateNumberStrategy.setConverter(NumberToStringConverter.fromInteger(false));
		UpdateValueStrategy requestNumberStrategy = new UpdateValueStrategy(true,
				UpdateValueStrategy.POLICY_ON_REQUEST);
		requestNumberStrategy.setConverter(StringToNumberConverter.toInteger(false));
		
		IEMFValueProperty pConvertedMana = EMFProperties.value(CardPackage.Literals.CARD__CONVERTED_MANA_COST);
		dbc.bindValue(SWTObservables.observeText(convertedManaCost, SWT.Modify),
				pConvertedMana.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pPower = EMFProperties.value(CardPackage.Literals.CREATURE__POWER);
		dbc.bindValue(SWTObservables.observeText(power, SWT.Modify),
				pPower.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pToughness = EMFProperties.value(CardPackage.Literals.CREATURE__TOUGHNESS);
		dbc.bindValue(SWTObservables.observeText(toughness, SWT.Modify),
				pToughness.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
		
		IEMFValueProperty pNumber = EMFProperties.value(CardPackage.Literals.CARD__NUMBER);
		dbc.bindValue(SWTObservables.observeText(number, SWT.Modify),
				pNumber.observeDetail(cardSelection), 
				requestNumberStrategy,updateNumberStrategy);
	}

	private void initCardSelectionBinding() {
		// card list table binding
		IObservableValue setSelection = ViewersObservables.observeSingleSelection(setViewer);
		IEMFListProperty pCardList = EMFProperties.list(SetPackage.Literals.SET__CARDS);
		IObservableList cards = pCardList.observeDetail(setSelection);
		IEMFValueProperty[] pCardDetails = new IEMFValueProperty[3];
		pCardDetails[0] = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		pCardDetails[1] = EMFProperties.value(CardPackage.Literals.CARD__NUMBER);
		//pCardDetails[2] = EMFProperties.value(FeaturePath.fromList(EcorePackage.Literals.ETYPED_ELEMENT__ETYPE,EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME));
		pCardDetails[2] = EMFProperties.value(CardPackage.Literals.CARD__TYPE_STRING);
		ViewerSupport.bind(cardViewer, cards, pCardDetails);
	}
	
	private void initCollectionCardList() {
		
		IEMFValueProperty[] pCardDetails = new IEMFValueProperty[3];
		pCardDetails[0] = EMFProperties.value(DatabasePackage.Literals.MAGIC_DB_ELEMENT__NAME);
		pCardDetails[1] = EMFProperties.value(CardPackage.Literals.CARD__NUMBER);
		pCardDetails[2] = EMFProperties.value(CardPackage.Literals.CARD__TYPE_STRING);
		IObservableValue containerSelection = ViewersObservables.observeSingleSelection(containers);
		IEMFListProperty pContCardList = EMFProperties.list(CollectionPackage.Literals.CONTAINER__CARDS);
		IObservableList contCards = pContCardList.observeDetail(containerSelection);
		IEMFValueProperty pcard = EMFProperties.value(CollectionPackage.Literals.CARD_INSTANCE__CARD);
		IObservableList cards = pcard.observeDetail(contCards);
		ViewerSupport.bind(cardViewer, cards, pCardDetails);
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
	
	private void initCollectionViewer() {
		WritableList collContainers = new WritableList(collection.getContainers(), Container.class);
		IEMFValueProperty pContName = EMFProperties.value(CollectionPackage.Literals.COLLECTION_ELEMENT__NAME);
		ViewerSupport.bind(containers, collContainers, pContName);
	}

	private final class CardSelectionChangedListener implements
			ISelectionChangedListener {
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			// TODO Auto-generated method stub
			if (event.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection s = (IStructuredSelection) event
						.getSelection();
				if (s.getFirstElement() instanceof Card) {
					Card c = (Card) s.getFirstElement();
					Image cardImage = null;
					if (card2imageMap.containsKey(c)) {
						cardImage = card2imageMap.get(c);
					} else {
						if (online.getSelection()) {

							URL url = null;
							try {
								url = new URL(
										"http://magiccards.info/scans/en/"
												+ c.getSet().getId() + "/"
												+ c.getNumber() + ".jpg");
							} catch (MalformedURLException ex) {
								System.out
										.println("Something wrong with set id or card number");
							}
							ImageDescriptor i = ImageDescriptor
									.createFromURL(url);
							cardImage = i.createImage();
							card2imageMap.put(c, cardImage);
						} else {
							cardImage = card2imageMap.get(empty);
						}
					}
					double width = image.getBounds().width;
					double height = image.getBounds().height;
					double zoom = width/(double)(cardImage.getImageData().width);
					if(height/(double)(cardImage.getImageData().height) < zoom){
						zoom = height/(double)(cardImage.getImageData().height);
					}
					ImageData id = cardImage.getImageData().scaledTo((int)(cardImage.getImageData().width*zoom), (int)(cardImage.getImageData().height*zoom));
					cardImage = ImageDescriptor.createFromImageData(id).createImage();
					if (cardImage != null) {
						image.setImage(cardImage);
					} else {
						image.setText("Image not found");
					}
				}
			}
		}
	}

	private final class DuplicateSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			IStructuredSelection sel = (IStructuredSelection) cardViewer.getSelection();
			
			if (collSelected) {
				IStructuredSelection selCont = (IStructuredSelection) containers
						.getSelection();

				for (Object selected : sel.toList()) {
					if (selected instanceof Card) {

						Card card = (Card) selected;

						if (selCont.getFirstElement() instanceof Container) {
							Container c = (Container) selCont.getFirstElement();
							CardInstance ci = null;
							for (CardInstance tci : c.getCards()) {
								if (tci.getCard().equals(card)) {
									ci = tci;
									break;
								}
							}
							if (ci != null) {
								CardInstance newci = EcoreUtil.copy(ci);
								c.getCards().add(newci);
							}
						}
					}
				}
			}
			
		}
	}

	private final class MoveSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			// move
			if(collection != null){
				if(collSelected){
					IStructuredSelection selCont = (IStructuredSelection) containers.getSelection();
					if (selCont.getFirstElement() instanceof Container) {
						Container c = (Container) selCont.getFirstElement();
						MagicMoveToDialog d = new MagicMoveToDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM, c, collection, cardViewer.getSelection());
						d.open();
					}
				} else {
					IStructuredSelection selSet = (IStructuredSelection) setViewer.getSelection();
					if (selSet.getFirstElement() instanceof Set) {
						Set s = (Set) selSet.getFirstElement();
						MagicMoveToDialog d = new MagicMoveToDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM, s, collection, cardViewer.getSelection());
						d.open();
					}
				}
			} 
			/*if(null != result && null != collection){
				//System.out.println("Container");
				collection.getContainers().add(result);
				containers.refresh();
			}*/
		}
	}

	private final class DeleteSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			IStructuredSelection sel = (IStructuredSelection) cardViewer.getSelection();
			
			if (collSelected) {
				IStructuredSelection selCont = (IStructuredSelection) containers
						.getSelection();

				for (Object selected : sel.toList()) {
					if (selected instanceof Card) {

						Card card = (Card) selected;

						if (selCont.getFirstElement() instanceof Container) {
							Container c = (Container) selCont.getFirstElement();
							CardInstance ci = null;
							for (CardInstance tci : c.getCards()) {
								if (tci.getCard().equals(card)) {
									ci = tci;
									break;
								}
							}
							if (ci != null) {
								c.getCards().remove(ci);
							}
						}
					}
				}
			}
			
		}
	}

	private final class InsertSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			String insertCard = insertNum.getText().trim();
			String setId = insertSetId.getText().trim();
			if("".equals(insertCard) || "".equals(setId)){
				return;
			}
			Card insert;
			try{
				int num = Integer.parseInt(insertCard);
				insert = MagicDatabaseHelper.findCardByNumberAndSetId(database, num, setId);
			} catch (NumberFormatException ex) {
				insert = MagicDatabaseHelper.findCardByNameAndSetId(database, insertCard, setId);
			}
			if(null != insert){
				IStructuredSelection s = (IStructuredSelection) containers.getSelection();
				if(s.getFirstElement() instanceof Container){
					Container cont = (Container)s.getFirstElement();
					CardInstance ci = CollectionFactory.eINSTANCE.createCardInstance();
					ci.setCard(insert);
					ci.setFoil(cbFoil.getSelection());
					ci.setProxy(cbProxy.getSelection());
					if(cont.getCards().add(ci)){
						System.out.println("Card added.");
					}
					cardViewer.reveal(ci.getCard());
					insertNum.setText("");
					insertNum.setFocus();
					//insertSetId.setText("");
					cbFoil.setSelection(false);
					cbProxy.setSelection(false);
					
				}
			}
		}
	}

	private final class SetSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			IStructuredSelection s = (IStructuredSelection)setViewer.getSelection();
			if(s.getFirstElement() instanceof Set){
				selSet = (Set) s.getFirstElement();
			}
		}
	}

	private final class BlockSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			IStructuredSelection s = (IStructuredSelection)blockViewer.getSelection();
			if(s.getFirstElement() instanceof Block){
				selBlock = (Block) s.getFirstElement();
			}
		}
	}

	private final class TabSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			if(e.item instanceof TabItem){
				TabItem t = (TabItem) e.item;
				if(t.getText().equals(MagicLocales.MagicApplicationGUI_tbtmDatabase_text)){
					initCardSelectionBinding();
					collSelected = false;
				} else if(t.getText().equals(MagicLocales.MagicApplicationGUI_tbtmCollections_text)){
					initCollectionCardList();
					collSelected = true;
				}
			}
		}
	}

	private final class PreferencesSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			
		}
	}

	private final class SaveSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			
			if(null != databaseResource){
				EList<EObject> contents = databaseResource.getContents();
				if(contents.size() > 0 && contents.get(0) == database){
					// TODO
				}
				if(contents.size() < 2 && contents.get(0) != collection){
					if(null != collection){
						contents.add(collection);
					}
					if(null != database){
						contents.add(database);
					}
					
				}
				try {
					databaseResource.save(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return;
			}
			FileDialog f = new FileDialog(shlMagicCollectionBuilder);
			f.setFilterExtensions(new String[]{"*.mdb","*.mc"});
			f.setText("Save To File...");
			String file = f.open();
			if(null != file && file.endsWith(".mdb")){
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("mdb", new XMIResourceFactoryImpl());
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getPackageRegistry().put
				(DatabasePackage.eNS_URI, DatabasePackage.eINSTANCE);
				URI fileURI = URI.createFileURI(file);
				databaseResource = resourceSet.createResource(fileURI);
				
			}
			
		}
	}

	private final class NewDeckSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			MagicNewContainerDialog d = new MagicNewContainerDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM);
			Container result = d.open();
			if(null != result && null != collection){
				//System.out.println("Container");
				collection.getContainers().add(result);
				containers.refresh();
			}
		}
	}

	private final class NewCollectionSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			MagicNewCollectionDialog d = new MagicNewCollectionDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM);
			Collection result = d.open();
			if(null != result){
				result.setDatabase(database);
				collection = result;
			}
		}
	}

	private final class NewSetSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			MagicNewSetDialog d = new MagicNewSetDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM);
			d.db = database;
			/*Set result = */d.open();
			/*if(null != result && null != database){
				//database.
			}*/
		}
	}

	private final class NewBlockSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			MagicNewBlockDialog d = new MagicNewBlockDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM);
			Block result = d.open();
			if(null != result && null != database){
				database.getBlocks().add(result);
			}
		}
	}

	private final class NewDatabaseSelectionAdapter extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			MagicNewDatabaseDialog d = new MagicNewDatabaseDialog(shlMagicCollectionBuilder, SWT.DIALOG_TRIM);
			Database result = d.open();
			if(null != result){
				database = result;
				collection = CollectionFactory.eINSTANCE.createCollection();
			}
		}
	}

	private final class OpenFileSelectionAdapter extends SelectionAdapter {
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			FileDialog fd = new FileDialog(shlMagicCollectionBuilder);
			fd.setFilterExtensions(new String[]{"*.mc","*.mdb","*.csv"});
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
			} else if(null != result && result.endsWith(".mc")){
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("mc", new XMIResourceFactoryImpl());
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getPackageRegistry().put
				(DatabasePackage.eNS_URI, DatabasePackage.eINSTANCE);
				resourceSet.getPackageRegistry().put
				(CollectionPackage.eNS_URI, CollectionPackage.eINSTANCE);
				URI fileURI = URI.createFileURI(result);
				databaseResource = resourceSet.createResource(fileURI);
				try {
					databaseResource.load(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(0 < databaseResource.getContents().size() && databaseResource.getContents().get(0) instanceof Collection){
					collection = (Collection)databaseResource.getContents().get(0);
					database = collection.getDatabase();
					dbTotal.setText("" + database.getCardTotal());
					collName.setText("" + collection.getName());
					owner.setText("" + collection.getOwner());
					desc.setText(collection.getDescription());
					initEMFBinding();
					/*for(Block b : database.getBlocks()){
						blockCombo.add(b.getName());
					}*/
					//setCombo.setItems();					
				}
			}
		}
	}

	private final class CardTableColumnSorter extends
			TableViewerColumnSorter {
		
		TableViewerColumn myColumn;
		
		private CardTableColumnSorter(TableViewerColumn column) {
			super(column);
			myColumn = column;
		}

		@Override
		protected int doCompare(Viewer viewer, Object e1, Object e2) {
			if(e1 instanceof Card && e2 instanceof Card){
				Card card1 = (Card)e1;
				Card card2 = (Card)e2;
				if(MagicLocales.MagicApplicationGUI_tblclmnName_text.equals(myColumn.getColumn().getText())){
					return card1.getName().compareTo(card2.getName());
				} else if(MagicLocales.MagicApplicationGUI_tblclmnNumber_text.equals(myColumn.getColumn().getText())){
					return card1.getNumber() - card2.getNumber();
				} else if(MagicLocales.MagicApplicationGUI_tblclmnType_text.equals(myColumn.getColumn().getText())){
					return card1.getClass().getSimpleName().compareTo(card2.getClass().getSimpleName());
				}
			}
			// Typical Comparable are String, Integer, Double, etc.
			return super.doCompare(viewer, e1, e2);
		}

		@Override
		protected Object getValue(Object o) {
			// TODO remove this method, if your EditingSupport returns value
			return super.getValue(o);
		}
	}

	private final class DummyValidator implements IValidator {
		@Override
		public IStatus validate(Object value) {
			System.out.print(value.toString() + " : ");
			System.out.println(value.getClass().toString());
			return Status.OK_STATUS;
		}
	}

	private final class EEnumLiteralToRarityTypeConverter extends Converter {
		
		public EEnumLiteralToRarityTypeConverter(Object fromType, Object toType) {
			super(fromType, toType);
		}

		@Override
		public Object getToType() {
			return RarityType.class;
		}

		@Override
		public Object getFromType() {
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
		}

		@Override
		public Object getToType() {
			return EEnumLiteral.class;
		}

		@Override
		public Object getFromType() {
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
