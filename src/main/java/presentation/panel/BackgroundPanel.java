package presentation.panel;

import java.awt.Dimension;
import java.awt.Graphics;

import presentation.button.ExitButton;
import presentation.button.MinButton;
import presentation.button.PlayerButton;
import presentation.button.Player_SortButton;
import presentation.button.TeamButton;
import presentation.button.Team_SortButton;
import presentation.common.Admin;
import presentation.common.ImgSys;
import presentation.common.Transparent_Panel;
import presentation.lable.LogoLable;
import presentation.main.UIController;

public class BackgroundPanel extends Transparent_Panel{
	/**
	 * 背景
	 */

	/**
	 * 设置背景上应有的图片，按钮
	 * @param width
	 * @param height
	 */
	public BackgroundPanel(int width, int height) {
		super(width, height);
		ExitButton exit = new ExitButton("exit", new Dimension((int) (35*Admin.proportion),(int) (35*Admin.proportion)), (int)(width - 45*Admin.proportion), (int)(6*Admin.proportion));
		MinButton min = new MinButton("min", new Dimension((int) (35*Admin.proportion), (int) (35*Admin.proportion)), (int)(width - 85*Admin.proportion), (int)(6*Admin.proportion));
		LogoLable logoLable = new LogoLable("logo", new Dimension((int) (197*Admin.proportion),(int) (110*Admin.proportion)), (int)(2*Admin.proportion), (int)(2*Admin.proportion));
		
		PlayerButton playerButton = new PlayerButton("player", new Dimension((int) (119*Admin.proportion),(int) (37*Admin.proportion)), (int)(250*Admin.proportion), (int)(60*Admin.proportion));
		TeamButton teamButton = new TeamButton("team", new Dimension((int) (119*Admin.proportion),(int) (37*Admin.proportion)), (int)(370*Admin.proportion), (int)(60*Admin.proportion));
		Player_SortButton player_SortButton = new Player_SortButton("player_sort", new Dimension((int) (119*Admin.proportion),(int) (37*Admin.proportion)), (int)(490*Admin.proportion), (int)(60*Admin.proportion));
		Team_SortButton team_SortButton = new Team_SortButton("team_sort", new Dimension((int) (119*Admin.proportion),(int) (37*Admin.proportion)), (int)(610*Admin.proportion), (int)(60*Admin.proportion));
		
		add(exit);
		add(min);
		add(logoLable);
		
		add(playerButton);
		add(player_SortButton);
		add(teamButton);
		add(team_SortButton);
		UIController.getInstance().addButton(playerButton);
		UIController.getInstance().addButton(player_SortButton);
		UIController.getInstance().addButton(teamButton);
		UIController.getInstance().addButton(team_SortButton);
		
		CardPanel cardPanel = new CardPanel((int)(840*Admin.proportion), (int)(477*Admin.proportion));
		UIController.getInstance().setPanel(cardPanel);
		cardPanel.addPanel(new WelcomePanel((int)(840*Admin.proportion), (int)(477*Admin.proportion)), PanelEnum.WelcomePanel+"");
		cardPanel.addPanel(new TeamListPanel((int)(840*Admin.proportion), (int)(477*Admin.proportion)), PanelEnum.TeamPanel+"");
		cardPanel.addPanel(new PlayerListPanel((int)(840*Admin.proportion), (int)(477*Admin.proportion)), PanelEnum.PlayerPanel+"");
		add(cardPanel);
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public void paintComponent(Graphics arg0) {
		arg0.drawImage(ImgSys.background, 0, 0, null);
		repaint();
	}
}
