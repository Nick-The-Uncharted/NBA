package presentation.button;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EtchedBorder;

import presentation.common.ImgSys;
import presentation.common.MyButton;

public class SearchButton extends MyButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SearchButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.search);
	}

	@Override
	public MouseAdapter getMouseAdapter() {
		MouseAdapter mouseAdapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				click();
				System.out.println("Search");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setBorderPainted(true);
				setBorder(new EtchedBorder(25,Color.LIGHT_GRAY, Color.BLUE));
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e){
				setBorder(null);
				setBorderPainted(false);
				setCursor(Cursor.getDefaultCursor());
			}
		};
		return mouseAdapter;
	}

}
