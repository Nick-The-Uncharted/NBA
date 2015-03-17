package presentation.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

import presentation.common.Admin;
import presentation.common.Transparent_Panel;

public class CardPanel extends Transparent_Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 卡片布局，切换界面
	 */
	private CardLayout cardLayout;

	public CardPanel(int width, int height) {
		super(width, height);
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		setLocation((int) (80*Admin.proportion), (int) (120*Admin.proportion));
	}
	
	/**
	 * 添加需要控制的界面
	 * @param panel
	 * @param key
	 */
	void addPanel(JPanel panel, String key){
		this.add(panel, key);
	}
	
	/**
	 * 实现跳转
	 * @param key
	 */
	public void jumpTo(String key){
		cardLayout.show(this, key);
	}
}
