package presentation.command;

import presentation.table.PlayerTable;

public class PlayerNextPageCommand implements Command{

	private PlayerTable table;
	
	public PlayerNextPageCommand(PlayerTable table) {
		this.table = table;
	}
	
	@Override
	public void excute() {
		table.nextPage();
	}
	
}
