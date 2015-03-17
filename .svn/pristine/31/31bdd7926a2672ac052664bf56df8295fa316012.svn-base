package presentation.common;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TeamScrollPane extends JScrollPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TeamScrollPane(int width, int height) {
		setSize(width, height);
		setOpaque(false);
		getViewport().setOpaque(false);
		setLocation(10, 75);
		setBorder(null);
		getViewport().add(new TeamLogo());
		JScrollBar bar = getVerticalScrollBar();
		bar.setBackground(null);
		bar.setUnitIncrement(15);
	}

}
