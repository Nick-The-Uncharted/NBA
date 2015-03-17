package presentation.button;

import java.awt.Dimension;

import presentation.common.ImgSys;
import presentation.common.MyButton;
import presentation.main.UIController;
import presentation.panel.PanelEnum;

/**
 * 球队查询按钮
 * @author HCW
 *
 */
public class TeamButton extends MyButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param name
	 * @param dimension
	 * @param x
	 * @param y
	 */
	public TeamButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.team);
		setPressedImg(ImgSys.team_selected);
		setRolloverImg(ImgSys.team_selected);
	}

	@Override
	protected void enter() {
		// TODO Auto-generated method stub
		super.enter();
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
		super.click();
		UIController.getInstance().jumpTo(PanelEnum.TeamPanel);
	}
	
}
