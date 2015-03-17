package presentation.lable;

import java.awt.Dimension;

import presentation.common.ImgSys;
import presentation.common.MyLabel;

/**
 * 系统logo
 * @author HCW
 *
 */
public class LogoLable extends MyLabel{

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
	public LogoLable(String name, Dimension dimension, int x, int y) {
		super("", dimension, x, y);
		setImg(ImgSys.logo);
	}

}
