package idao;

import javax.sql.rowset.CachedRowSet;

public interface ITeamDAO {
//	获取某队伍所有比赛信息
	CachedRowSet getTeamMatchesData(String teamName);
//	获取所有队伍信息
	CachedRowSet getAllTeamInfo();
//	获取某个队伍信息
	CachedRowSet getTeamInfo(String teamName);
}
