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
package madcow.magic.ui;

import madcow.magic.ui.application.MagicApplicationGUI;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Display;

/**
 * 
 * @author Ábel Hegedüs
 *
 */
public class MagicApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				try {
					MagicApplicationGUI window = new MagicApplicationGUI();
					window.open();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		return 0;
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
