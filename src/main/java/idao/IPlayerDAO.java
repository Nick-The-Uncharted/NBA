package idao;

import javax.sql.rowset.CachedRowSet;

public interface IPlayerDAO {
	CachedRowSet getPlayerAllMatchData();
	CachedRowSet getPlayerInfo();
}
