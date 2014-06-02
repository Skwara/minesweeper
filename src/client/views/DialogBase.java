package client.views;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Base class for small modal windows.
 */
public abstract class DialogBase extends JDialog {

	public DialogBase(JFrame owner, boolean isModal) {
		super(owner, isModal);
		forceWindowsStyle(); // sets the Windows-like GUI styling
	}

	private void forceWindowsStyle() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// Replace with Logger
			e.printStackTrace();
		}
	}
}
