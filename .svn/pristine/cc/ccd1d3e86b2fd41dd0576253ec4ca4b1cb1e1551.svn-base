package presentation.common;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Admin {
	public static double defaultScreenWidth = 1366;
	public static double proportion = 1.0;
	public static JFrame my_frame;
	
	public static void setProportion(){
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		proportion = screenWidth/defaultScreenWidth;
	}
	
	public static void addFrame(JFrame frame){
		my_frame = frame;
	}
}
