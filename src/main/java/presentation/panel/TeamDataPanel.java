package presentation.panel;

import presentation.common.Admin;
import presentation.common.TeamDataScrollPane;
import presentation.common.Transparent_Panel;
import presentation.table.TeamSumDataTable;

public class TeamDataPanel extends Transparent_Panel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TeamDataPanel(int width, int height, String name) {
		super(width, height);
		TeamSumDataTable sumDataTable = new TeamSumDataTable(width, (int) (height/2 - 20*Admin.proportion), 0, 0);
		TeamDataScrollPane scrollPaneSum = new TeamDataScrollPane(sumDataTable, 0, 10, width, height/2 - 40);
		add(scrollPaneSum);
		TeamSumDataTable averageDataTable = new TeamSumDataTable(width, (int) (height/2 - 20*Admin.proportion), 0, 0);
		TeamDataScrollPane scrollPaneAverage = new TeamDataScrollPane(averageDataTable, 0, height/2, width, height/2 - 40);
		add(scrollPaneAverage);
	}

}
