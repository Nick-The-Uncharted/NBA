package presentation.common;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TeamDataScrollPane extends JScrollPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamDataScrollPane(JTable table, int x, int y, int width, int height) {
		setBounds((int)(x*Admin.proportion), (int) (y*Admin.proportion), width, height);
		setOpaque(false);
		setBorder(null);
		getViewport().add(table);
		getViewport().setOpaque(false);
	}
}
