package presentation.button;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import presentation.command.Command;
import presentation.common.MyButton;

public class ControlButton extends MyButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Command command;

	public ControlButton(Command command, String name, Dimension dimension,
			int x, int y) {
		this(name, dimension, x, y);
		this.command = command;
	}

	public ControlButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
	}

	@Override
	public MouseAdapter getMouseAdapter() {
		MouseAdapter mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				command.excute();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e){
				setCursor(Cursor.getDefaultCursor());
			}
		};
		return mouseAdapter;
	}

}
