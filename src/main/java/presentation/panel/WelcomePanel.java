package presentation.panel;

import java.awt.Graphics;

import presentation.common.ImgSys;
import presentation.common.Transparent_Panel;

/**
 * 欢迎界面
 * @author HCW
 *
 */
public class WelcomePanel extends Transparent_Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomePanel(int width, int height) {
		super(width, height);
	}

	@Override
	public void paintComponent(Graphics arg0) {
		super.paintComponents(arg0);
		arg0.drawImage(ImgSys.welcome, 0, 0, null);
	}
}
