package presentation.command;

import presentation.table.PlayerTable;

public class PlayerLastPageCommand implements Command{

	private PlayerTable table;
	
	public PlayerLastPageCommand(PlayerTable table) {
		this.table = table;
	}
	
	@Override
	public void excute() {
		table.lastPage();
	}

}
