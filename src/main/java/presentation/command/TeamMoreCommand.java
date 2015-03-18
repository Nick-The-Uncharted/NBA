package presentation.command;

import presentation.common.Admin;
import presentation.main.UIController;
import presentation.panel.TeamDataPanel;

public class TeamMoreCommand implements Command{

	private String teamName;
	
	public TeamMoreCommand(String name) {
		teamName = name;
	}
	
	@Override
	public void excute() {
		UIController.getInstance().addPanel(new TeamDataPanel((int)(840*Admin.proportion), (int)(477*Admin.proportion), teamName), teamName+"data");
		UIController.getInstance().jumpTo(teamName+"data");
	}

}
