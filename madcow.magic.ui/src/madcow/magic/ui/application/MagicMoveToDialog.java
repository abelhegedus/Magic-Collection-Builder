package madcow.magic.ui.application;

import madcow.magic.collection.CardInstance;
import madcow.magic.collection.Collection;
import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.CollectionPackage;
import madcow.magic.collection.Container;
import madcow.magic.database.card.Card;
import madcow.magic.database.core.DatabaseFactory;
import madcow.magic.database.core.DatabasePackage;

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
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
	protected IStructuredSelection selection;
	private Button keepCardsAsProxy;
	private ComboViewer contViewer;
	private Button deleteMovedProxy;
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public MagicMoveToDialog(Shell parent, int style, Container c, ISelection sel) {
		super(parent, style);
		container = c;
		selection = (IStructuredSelection)sel;
		setText(MagicLocales.MagicNewContainerDialog_this_text);
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public void open() {
		createContents();
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
		shlMoveDialog.setSize(309, 150);
		shlMoveDialog.setText(MagicLocales.MagicMoveToDialog_shlMoveDialog_text_1);
		shlMoveDialog.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlMoveDialog, SWT.NONE);
		composite.setLayoutData(BorderLayout.SOUTH);
		
		Composite composite_1 = new Composite(shlMoveDialog, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.CENTER);
		composite_1.setLayout(new GridLayout(2, false));
		
		Label lblTargetContainer = new Label(composite_1, SWT.NONE);
		lblTargetContainer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTargetContainer.setText(MagicLocales.MagicMoveToDialog_lblTargetContainer_text);
		
		contViewer = new ComboViewer(composite_1, SWT.NONE);
		Combo combo = contViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite_1, SWT.NONE);
		
		keepCardsAsProxy = new Button(composite_1, SWT.CHECK);
		keepCardsAsProxy.setText(MagicLocales.MagicMoveToDialog_btnKeepCardsAs_text);
		
		Label lblSelectContainerFor = new Label(shlMoveDialog, SWT.NONE);
		lblSelectContainerFor.setLayoutData(BorderLayout.NORTH);
		lblSelectContainerFor.setText(MagicLocales.MagicMoveToDialog_lblSelectContainerFor_text);
		
		WritableList collContainers = new WritableList(container.getCollection().getContainers(), Container.class);
		IEMFValueProperty pContName = EMFProperties.value(CollectionPackage.Literals.COLLECTION_ELEMENT__NAME);
		ViewerSupport.bind(contViewer, collContainers, pContName);
		new Label(composite_1, SWT.NONE);
		
		deleteMovedProxy = new Button(composite_1, SWT.CHECK);
		deleteMovedProxy.setText(MagicLocales.MagicMoveToDialog_btnDeleteMovedProxy_text);

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
