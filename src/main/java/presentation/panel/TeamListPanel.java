package presentation.panel;

import java.awt.Graphics;

import presentation.common.ImgSys;
import presentation.common.TeamScrollPane;
import presentation.common.Transparent_Panel;

/**
 * 显示球队列表的panel
 * @author HCW
 *
 */
public class TeamListPanel extends Transparent_Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamListPanel(int width, int height) {
		super(width, height);
		TeamScrollPane scrollPane = new TeamScrollPane(width+10, height-100);
		add(scrollPane);
	}

	
	@Override
	public void paintComponent(Graphics arg0) {
		arg0.drawImage(ImgSys.teamList, 0, 0, null);
	}
}
