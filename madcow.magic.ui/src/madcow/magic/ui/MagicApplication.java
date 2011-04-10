package madcow.magic.ui;

import madcow.magic.ui.application.MagicApplicationGUI;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class MagicApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		MagicApplicationGUI window = new MagicApplicationGUI();
		window.open();
		return 0;
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
