package presentation.lable;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

import presentation.common.Admin;
import presentation.common.FontList;
import presentation.common.MyFont;

public class TeamDetailLabel extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamDetailLabel(String name, Dimension dimension, int x, int y) {
		setForeground(Color.WHITE);
		setFont(MyFont.getFont(FontList.Jian, (int)(25*Admin.proportion)));
		setText(name);
		setSize(dimension);
		setLocation((int)(x*Admin.proportion), (int) (y*Admin.proportion));
	}
}
