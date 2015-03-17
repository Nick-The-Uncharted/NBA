package presentation.common;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * 基带按钮，所有按钮需继承
 * @author HCW
 *
 */
public class MyButton extends JButton implements FocusListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 按钮的图片
	 */
	private ImageIcon img;
	private ImageIcon pressedImg;
	private ImageIcon rolloverImg;
	

	/**
	 * 构造函数设置按钮的基本属性
	 * @param name 名字
	 * @param dimension 大小
	 */
	public MyButton(String name, Dimension dimension, int x, int y) {
		setName(name);
		setSize(dimension);
		setLocation(x, y);
		setBorderPainted(false);
		setOpaque(false);
		setContentAreaFilled(false);
		this.addMouseListener(this.getMouseAdapter());
		this.addFocusListener(this);
	}

	public void setPressedImg(ImageIcon pressedImg) {
		this.pressedImg = pressedImg;
	}

	public void setRolloverImg(ImageIcon rolloverImg) {
		this.rolloverImg = rolloverImg;
	}
	
	public void setImg(ImageIcon img){
		this.img = img;
		setIcon(img);
	}

	public MouseAdapter getMouseAdapter() {
		MouseAdapter mouseAdapter = new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setIcon(rolloverImg);
				enter();
			}
			public void mouseClicked(MouseEvent e) {
				setIcon(pressedImg);
				click();
			}
			public void mouseExited(MouseEvent e){
				if (!isFocusOwner()) {
					setIcon(img);
					exit();
				}
			}
		};
		return mouseAdapter;
	}
	
	/**
	 * needed rewrite
	 */
	protected void enter(){
	}
	
	/**
	 * needed rewrite
	 */
	protected void click(){
	}
	
	/**
	 * needed rewrite
	 */
	protected void exit(){
	}

	@Override
	public void focusGained(FocusEvent e) {
	}

	@Override
	public void focusLost(FocusEvent e) {
		setIcon(img);
	}
}
