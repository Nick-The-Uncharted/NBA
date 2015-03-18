package dao;

import javax.sql.rowset.CachedRowSet;

import utility.CachedRowSetFactory;
import idao.IPlayerDAO;

public class PlayerDAO implements IPlayerDAO{

	@Override
	public CachedRowSet getPlayerAllMatchData(String playerName) {
		return CachedRowSetFactory.getCachedRowSet("SELECT * FROM PLAYERDATA WHERE NAME='" + playerName + "'");
	}

	@Override
	public CachedRowSet getAllPlayerInfo() {
		return CachedRowSetFactory.getCachedRowSet("*", "PLAYERS");
	}

	@Override
	public CachedRowSet getPlayerInfo(String playerName) {
		return null;
	}

	
}
