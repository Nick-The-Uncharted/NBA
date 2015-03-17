package presentation.main;

import presentation.panel.CardPanel;
import presentation.panel.PanelEnum;

/**
 * 
 * @author HCW
 *
 */
public class UIController {
	/**
	 * 负责界面跳蛛的控制，控制panel
	 */
	private static UIController controller;
	private CardPanel panel;
	
	/**
	 * 单件模式
	 * @return
	 */
	public static UIController getInstance(){
		if (controller == null) {
			controller = new UIController();
		}
		return controller;
	}
	
	/**
	 * 添加控制的cardPanel
	 * @param jPanel
	 */
	public void setPanel(CardPanel jPanel){
		this.panel = jPanel;
	}
	
	/**
	 * 根据key跳转界面
	 * @param key
	 */
	public void jumpTo(PanelEnum key){
		panel.jumpTo(key+"");
	}
}
