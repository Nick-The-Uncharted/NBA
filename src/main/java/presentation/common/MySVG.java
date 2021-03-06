package presentation.common;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EtchedBorder;

import org.apache.batik.swing.JSVGCanvas;

import presentation.main.UIController;
import presentation.panel.TeamDetailPanel;

public class MySVG extends JSVGCanvas{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public MySVG(String name) {
		this.name = name;
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
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				setBorder(new EtchedBorder(25,Color.ORANGE, Color.red));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				UIController.getInstance().addPanel(new TeamDetailPanel((int)(840*Admin.proportion), (int)(477*Admin.proportion), name), name);
				UIController.getInstance().jumpTo(name);
			}
			@Override
			public void mouseExited(MouseEvent e){
				setCursor(Cursor.getDefaultCursor());
				setBorder(null);
			}
		};
		return mouseAdapter;
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		super.setLocation((int)(x*Admin.proportion), (int)(y*Admin.proportion));
	}
	
	
}
