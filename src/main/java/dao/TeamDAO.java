package dao;


import javax.sql.rowset.CachedRowSet;

import utility.CachedRowSetFactory;
import idao.ITeamDAO;

public class TeamDAO implements ITeamDAO{

	@Override
	public CachedRowSet getTeamMatchesData(String teamName) {
		return CachedRowSetFactory.getCachedRowSet("SELECT * FROM MATCHES WHERE AGAINSTTEAMS LIKE '%" + teamName + "%'");
	}

	@Override
	public CachedRowSet getAllTeamInfo() {
		return CachedRowSetFactory.getCachedRowSet("*","TEAMS");
	}

	@Override
	public CachedRowSet getTeamInfo(String teamName) {
		return null;
	}


}
