package madcow.magic.ui.application;

import madcow.magic.collection.CollectionFactory;
import madcow.magic.collection.Container;
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
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.layout.grouplayout.LayoutStyle;
import madcow.magic.ui.locale.MagicLocales;

public class MagicNewContainerDialog extends Dialog {

	protected Container result;
	protected Shell shlNewDeckDialog;
	private Text name;
	private Text descr;
	private Text owner;
	private Text place;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public MagicNewContainerDialog(Shell parent, int style) {
		super(parent, style);
		setText(MagicLocales.MagicNewContainerDialog_this_text);
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Container open() {
		createContents();
		shlNewDeckDialog.open();
		shlNewDeckDialog.layout();
		Display display = getParent().getDisplay();
		while (!shlNewDeckDialog.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlNewDeckDialog = new Shell(getParent(), getStyle());
		shlNewDeckDialog.setSize(300, 200);
		shlNewDeckDialog.setText(MagicLocales.MagicNewContainerDialog_shlNewDeckDialog_text);
		shlNewDeckDialog.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlNewDeckDialog, SWT.NONE);
		composite.setLayoutData(BorderLayout.SOUTH);
		
		Button btnHelp = new Button(composite, SWT.NONE);
		btnHelp.setText(MagicLocales.MagicNewContainerDialog_btnHelp_text);
		
		Button btnOk = new Button(composite, SWT.NONE);
		btnOk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				result = CollectionFactory.eINSTANCE.createContainer();
				shlNewDeckDialog.dispose();
			}
		});
		btnOk.setText(MagicLocales.MagicNewContainerDialog_btnOk_text);
		
		Button btnCancel = new Button(composite, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				result = null;
				shlNewDeckDialog.dispose();
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
		
		Composite composite_1 = new Composite(shlNewDeckDialog, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.CENTER);
		composite_1.setLayout(new GridLayout(2, false));
		new Label(composite_1, SWT.NONE);
		
		Composite composite_2 = new Composite(composite_1, SWT.NONE);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnDeck = new Button(composite_2, SWT.RADIO);
		btnDeck.setSelection(true);
		btnDeck.setText(MagicLocales.MagicNewContainerDialog_btnDeck_text);
		
		
		Button btnContainer = new Button(composite_2, SWT.RADIO);
		btnContainer.setText(MagicLocales.MagicNewContainerDialog_btnContainer_text);
		
		Label lblName = new Label(composite_1, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText(MagicLocales.MagicNewContainerDialog_lblName_text);
		
		name = new Text(composite_1, SWT.BORDER);
		name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblDescription = new Label(composite_1, SWT.NONE);
		lblDescription.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescription.setText(MagicLocales.MagicNewContainerDialog_lblDescription_text);
		
		descr = new Text(composite_1, SWT.BORDER);
		descr.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblOwner = new Label(composite_1, SWT.NONE);
		lblOwner.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOwner.setText(MagicLocales.MagicNewContainerDialog_lblOwner_text);
		
		owner = new Text(composite_1, SWT.BORDER);
		owner.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPlace = new Label(composite_1, SWT.NONE);
		lblPlace.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPlace.setText(MagicLocales.MagicNewContainerDialog_lblPlace_text);
		
		place = new Text(composite_1, SWT.BORDER);
		place.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblProvideNameOwner = new Label(shlNewDeckDialog, SWT.NONE);
		lblProvideNameOwner.setAlignment(SWT.CENTER);
		lblProvideNameOwner.setLayoutData(BorderLayout.NORTH);
		lblProvideNameOwner.setText(MagicLocales.MagicNewContainerDialog_lblProvideNameOwner_text);

	}
}
