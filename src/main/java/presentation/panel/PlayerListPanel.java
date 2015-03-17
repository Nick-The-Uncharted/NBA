package presentation.panel;

import java.awt.Dimension;

import javax.swing.JTextField;

import presentation.button.SearchButton;
import presentation.common.Admin;
import presentation.common.Transparent_Panel;
import presentation.table.PlayerTable;

/**
 * 球员查询界面
 * @author HCW
 *
 */
public class PlayerListPanel extends Transparent_Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField input;
	private SearchButton searchButton;

	public PlayerListPanel(int width, int height) {
		super(width, height);
		input = new JTextField("请输入球员名字");
		input.setBounds((int) (5*Admin.proportion), (int) (5*Admin.proportion), (int) (100*Admin.proportion), (int) (25*Admin.proportion));
		searchButton = new SearchButton("search", new Dimension((int) (58*Admin.proportion), (int) (25*Admin.proportion)), (int) (115*Admin.proportion), (int) (5*Admin.proportion));
		add(input);
		add(searchButton);
		add(new PlayerTable((int) (width-50*Admin.proportion), (int)(height-100*Admin.proportion), (int) (getX()+25*Admin.proportion), (int) (getY()+50*Admin.proportion)));
	}
	
}