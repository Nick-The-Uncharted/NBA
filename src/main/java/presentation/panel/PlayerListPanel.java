package presentation.panel;

import java.awt.Dimension;

import javax.swing.JTextField;

import presentation.button.ControlButton;
import presentation.button.SearchButton;
import presentation.command.PlayerLastPageCommand;
import presentation.command.PlayerNextPageCommand;
import presentation.common.Admin;
import presentation.common.ImgSys;
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
	private ControlButton nextPage;
	private ControlButton lastPage;
	

	public PlayerListPanel(int width, int height) {
		super(width, height);
		PlayerTable table = new PlayerTable((int) (width-50*Admin.proportion), (int)(height-200*Admin.proportion), (int) (getX()+25*Admin.proportion), (int) (getY()+80*Admin.proportion));
		input = new JTextField("请输入球员名字");
		input.setBounds((int) (5*Admin.proportion), (int) (5*Admin.proportion), (int) (100*Admin.proportion), (int) (25*Admin.proportion));
		searchButton = new SearchButton("search", new Dimension((int) (58*Admin.proportion), (int) (25*Admin.proportion)), (int) (115*Admin.proportion), (int) (5*Admin.proportion));
		nextPage = new ControlButton(new PlayerNextPageCommand(table),"next", new Dimension((int) (40*Admin.proportion),(int) (40*Admin.proportion)), (int) (getX()+600*Admin.proportion), (int) (getY() + 380*Admin.proportion));
		nextPage.setImg(ImgSys.nextPage);
		lastPage = new ControlButton(new PlayerLastPageCommand(table),"last", new Dimension((int) (40*Admin.proportion),(40)), (int) (getX()+200*Admin.proportion), (int) (getY() + 380*Admin.proportion));
		lastPage.setImg(ImgSys.lastPage);
		add(nextPage);
		add(lastPage);
		add(input);
		add(searchButton);
		add(table);
	}
	
}
