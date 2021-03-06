package presentation.common;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 基带JLabel，所有的Lable需继承该类
 * @author HCW
 *
 */
public class MyLabel extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * jlable图片
	 */
	private ImageIcon img;

	/**
	 * 设置Lab了的标识，位置，大小
	 * @param name
	 * @param dimension
	 * @param x
	 * @param y
	 */
	public MyLabel(String name, Dimension dimension, int x, int y) {
		setForeground(Color.WHITE);
		setFont(MyFont.getFont(FontList.YING, (int)(13*Admin.proportion)));
		setText(name);
		setSize(dimension);
		setLocation((int)(x*Admin.proportion), (int) (y*Admin.proportion));
		setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void setImg(ImageIcon icon) {
		this.img = icon;
		setIcon(img);
	}
}
