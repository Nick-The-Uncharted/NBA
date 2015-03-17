package presentation.button;

import java.awt.Dimension;

import presentation.common.ImgSys;
import presentation.common.MyButton;

public class ExitButton extends MyButton{

	/**
	 * 退出按钮
	 */
	private static final long serialVersionUID = 1L;

	public ExitButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.exit);
		setPressedImg(ImgSys.exit);
		setRolloverImg(ImgSys.exit);
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
		System.out.println("Exit");
		System.exit(1);
	}

	@Override
	protected void exit() {
		// TODO Auto-generated method stub
		super.exit();
		setLocation(getX()-5, getY()+5);
	}
	
}
