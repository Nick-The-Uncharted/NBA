package idao;

import javax.sql.rowset.CachedRowSet;

public interface IPlayerDAO {
//	获取单个运动运所有比赛数据
	CachedRowSet getPlayerAllMatchData(String playerName);
//	获取所有运动员个人信息
	CachedRowSet getAllPlayerInfo();
//	获取某个运动员个人信息
	CachedRowSet getPlayerInfo(String playerName);
}
