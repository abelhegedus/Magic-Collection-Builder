package madcow.magic.ui.application;

import madcow.magic.collection.CardCondition;
import madcow.magic.collection.CardInstance;
import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.collection.Container;
import madcow.magic.database.card.Card;
import madcow.magic.database.card.CardPackage;
import madcow.magic.database.core.DatabaseFactory;
import madcow.magic.database.core.DatabasePackage;
import madcow.magic.database.set.Set;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swt.SWT;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.grouplayout.GroupLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.layout.grouplayout.LayoutStyle;

import madcow.magic.ui.locale.MagicLocales;
import com.swtdesigner.SWTResourceManager;

public class MagicMoveToDialog extends Dialog {

	protected Container result;
	protected Shell shlMoveDialog;
	protected Container container;
	protected Set set;
	protected Collection collection;
	protected IStructuredSelection selection;
	private Button keepCardsAsProxy;
	private ComboViewer contViewer;
	private Button deleteMovedProxy;
	private Button btnFoil;
	private Button btnProxy;
	private ComboViewer condViewer;
	private Combo condCombo;
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 * @wbp.parser.constructor
	 */
	public MagicMoveToDialog(Shell parent, int style, Container c, Collection coll, ISelection sel) {
		super(parent, style);
		container = c;
		collection = coll;
		selection = (IStructuredSelection)sel;
		setText(MagicLocales.MagicNewContainerDialog_this_text);
	}
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public MagicMoveToDialog(Shell parent, int style, Set s, Collection coll, ISelection sel) {
		super(parent, style);
		set = s;
		collection = coll;
		selection = (IStructuredSelection)sel;
		setText(MagicLocales.MagicNewContainerDialog_this_text);
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public void open() {
		createContents();
		if(set == null){
			btnFoil.setEnabled(false);
			btnProxy.setEnabled(false);
			condCombo.setEnabled(false);
		} else if(container == null){
			keepCardsAsProxy.setEnabled(false);
			deleteMovedProxy.setEnabled(false);
		}
		shlMoveDialog.open();
		shlMoveDialog.layout();
		Display display = getParent().getDisplay();
		while (!shlMoveDialog.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlMoveDialog = new Shell(getParent(), getStyle());
		shlMoveDialog.setSize(275, 250);
		shlMoveDialog.setText(MagicLocales.MagicMoveToDialog_shlMoveDialog_text_1);
		shlMoveDialog.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlMoveDialog, SWT.NONE);
		composite.setLayoutData(BorderLayout.SOUTH);
		
		Composite composite_1 = new Composite(shlMoveDialog, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.CENTER);
		composite_1.setLayout(new GridLayout(3, false));
		
		Label lblTargetContainer = new Label(composite_1, SWT.NONE);
		lblTargetContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTargetContainer.setText(MagicLocales.MagicMoveToDialog_lblTargetContainer_text);
		
		contViewer = new ComboViewer(composite_1, SWT.NONE);
		Combo combo = contViewer.getCombo();
		GridData gd_combo = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
		gd_combo.widthHint = 113;
		combo.setLayoutData(gd_combo);
		new Label(composite_1, SWT.NONE);
		
		Label lblFromContainer = new Label(composite_1, SWT.NONE);
		lblFromContainer.setText(MagicLocales.MagicMoveToDialog_lblFromContainer_text);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		keepCardsAsProxy = new Button(composite_1, SWT.CHECK);
		GridData gd_keepCardsAsProxy = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_keepCardsAsProxy.widthHint = 134;
		keepCardsAsProxy.setLayoutData(gd_keepCardsAsProxy);
		keepCardsAsProxy.setText(MagicLocales.MagicMoveToDialog_btnKeepCardsAs_text);
		new Label(composite_1, SWT.NONE);
		
		deleteMovedProxy = new Button(composite_1, SWT.CHECK);
		GridData gd_deleteMovedProxy = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_deleteMovedProxy.widthHint = 157;
		deleteMovedProxy.setLayoutData(gd_deleteMovedProxy);
		deleteMovedProxy.setText(MagicLocales.MagicMoveToDialog_btnDeleteMovedProxy_text);
		new Label(composite_1, SWT.NONE);
		
		Label lblFromSet = new Label(composite_1, SWT.NONE);
		lblFromSet.setText(MagicLocales.MagicMoveToDialog_lblFromSet_text);
		new Label(composite_1, SWT.NONE);
		
		Label lblCondition = new Label(composite_1, SWT.NONE);
		lblCondition.setText(MagicLocales.MagicMoveToDialog_lblCondition_text);
		
		condViewer = new ComboViewer(composite_1, SWT.NONE);
		condCombo = condViewer.getCombo();
		GridData gd_combo_1 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
		gd_combo_1.widthHint = 114;
		condCombo.setLayoutData(gd_combo_1);
		new Label(composite_1, SWT.NONE);
		
		btnFoil = new Button(composite_1, SWT.CHECK);
		btnFoil.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnFoil.setText(MagicLocales.MagicMoveToDialog_btnFoil_text);
		
		btnProxy = new Button(composite_1, SWT.CHECK);
		btnProxy.setText(MagicLocales.MagicMoveToDialog_btnProxy_text);
		
		Label lblSelectContainerFor = new Label(shlMoveDialog, SWT.NONE);
		lblSelectContainerFor.setLayoutData(BorderLayout.NORTH);
		lblSelectContainerFor.setText(MagicLocales.MagicMoveToDialog_lblSelectContainerFor_text);
		
		WritableList collContainers = new WritableList(collection.getContainers(), Container.class);
		IEMFValueProperty pContName = EMFProperties.value(CollectionPackage.Literals.COLLECTION_ELEMENT__NAME);
		ViewerSupport.bind(contViewer, collContainers, pContName);
		
		IObservableList raritys = EMFObservables.observeList(CollectionPackage.Literals.CARD_CONDITION, EcorePackage.Literals.EENUM__ELITERALS); 
		IEMFValueProperty pRarityName = EMFProperties.value(EcorePackage.Literals.EENUM_LITERAL__LITERAL);
		ViewerSupport.bind(condViewer, raritys, pRarityName);
		
		Button btnHelp = new Button(composite, SWT.NONE);
		btnHelp.setText(MagicLocales.MagicNewContainerDialog_btnHelp_text);
		
		Button btnOk = new Button(composite, SWT.NONE);
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selCont = (IStructuredSelection) contViewer.getSelection();
				if (selCont.getFirstElement() instanceof Container) {
					Container c = (Container) selCont.getFirstElement();
					for (Object selO : selection.toList()) {
						if (selO instanceof Card) {
							Card card = (Card) selO;

							CardInstance ci = null;
							if(container != null){
								for (CardInstance tci : container.getCards()) {
									if (tci.getCard().equals(card)) {
										ci = tci;
										break;
									}
								}
								if (ci != null) {
									if (deleteMovedProxy.getSelection() && ci.isProxy()) {
											container.getCards().remove(ci);
									} else if (keepCardsAsProxy.getSelection()) {
										CardInstance newCI = EcoreUtil.copy(ci);
										newCI.setContainer(c);
										if(!ci.isProxy()){
											newCI.setProxy(false);
											// change original to proxy
											ci.setProxy(true);
										}
									} else {
										ci.setContainer(c);
									}
								}
							} else if(set != null){
								ci = CollectionFactory.eINSTANCE.createCardInstance();
								ci.setDescription("Added by Move to...");
								ci.setFoil(btnFoil.getSelection());
								ci.setProxy(btnProxy.getSelection());
								IStructuredSelection is = (IStructuredSelection) condViewer.getSelection();
								if(is.getFirstElement() instanceof CardCondition){
									ci.setCondition((CardCondition) is.getFirstElement());
								}
								ci.setOwner(c.getOwner());
								ci.setName(card.getName());
								ci.setCard(card);
								c.getCards().add(ci);
							}
						}
					}
				}
				shlMoveDialog.dispose();
			}
		});
		btnOk.setText(MagicLocales.MagicNewContainerDialog_btnOk_text);
		
		Button btnCancel = new Button(composite, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMoveDialog.dispose();
			}
		});
		btnCancel.setText(MagicLocales.MagicNewContainerDialog_btnCancel_text);
		GroupLayout gl_composite = new GroupLayout(composite);
		gl_composite.setHorizontalGroup(
			gl_composite.createParallelGroup(GroupLayout.LEADING)
				.add(GroupLayout.TRAILING, gl_composite.createSequentialGroup()
					.addContainerGap(230, Short.MAX_VALUE)
					.add(btnHelp, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(btnOk, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.RELATED)
					.add(btnCancel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
		);
		gl_composite.setVerticalGroup(
			gl_composite.createParallelGroup(GroupLayout.LEADING)
				.add(gl_composite.createParallelGroup(GroupLayout.BASELINE)
					.add(btnCancel)
					.add(btnOk)
					.add(btnHelp))
		);
		composite.setLayout(gl_composite);
		
	}
}
