package presentation.common;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;

import org.apache.batik.swing.JSVGCanvas;

public class MySVG extends JSVGCanvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MySVG(String name) {
		String slash = "";
		if(System.getProperty("os.name").equals("Mac OS X")){
			slash = "/";
		}
		setURI("file:/" + slash +System.getProperty("user.dir")+"/data/teams/"+name+".svg");
		setSize((int) (100*Admin.proportion), (int) (80*Admin.proportion));
		addMouseListener(getMouseAdapter());
	}
	
	public MouseAdapter getMouseAdapter() {
		MouseAdapter mouseAdapter = new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				setBorder(new EtchedBorder(25,Color.ORANGE, Color.red));
			}
			public void mouseClicked(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e){
				setCursor(Cursor.getDefaultCursor());
				setBorder(null);
			}
		};
		return mouseAdapter;
	}
}
