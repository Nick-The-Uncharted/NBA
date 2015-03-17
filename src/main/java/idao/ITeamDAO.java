package idao;

import javax.sql.rowset.CachedRowSet;

public interface ITeamDAO {
	CachedRowSet getTeamMatchesData();
	CachedRowSet getTeamInfo();
}
