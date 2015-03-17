package presentation.button;

import java.awt.Dimension;

import javax.swing.JFrame;

import presentation.common.Admin;
import presentation.common.ImgSys;
import presentation.common.MyButton;

public class MinButton extends MyButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MinButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.min);
		setPressedImg(ImgSys.min);
		setRolloverImg(ImgSys.min);
		setLocation(x, y);
	}

	@Override
	protected void enter() {
		// TODO Auto-generated method stub
		super.enter();
		setLocation(getX()+5, getY()-5);
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
		super.click();
		Admin.my_frame.setExtendedState(JFrame.ICONIFIED);
		System.out.println("Min");
	}

	@Override
	protected void exit() {
		// TODO Auto-generated method stub
		super.exit();
		setLocation(getX()-5, getY()+5);
	}
	
}
