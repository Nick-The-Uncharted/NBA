package presentation.main;

import presentation.common.Admin;
import presentation.common.ImgSys;

/**
 * 
 * @author HCW
 * 
 */
public class Main {
	/**
	 * 主入口
	 */
	
	public static void main(String[] args) {
		Admin.setProportion();
		if (Admin.proportion != 1) {
			ImgSys.resizeImg();
		}
		MainFrame mainFrame = new MainFrame();
		Admin.addFrame(mainFrame);
		mainFrame.setVisible(true);
	}
}
