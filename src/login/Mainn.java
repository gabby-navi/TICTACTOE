package login;

import javax.swing.SwingUtilities;

public class Mainn {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new game();
			}
			
		});
	}
}


