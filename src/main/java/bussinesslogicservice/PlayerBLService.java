package bussinesslogicservice;

import java.util.ArrayList;

import entity.PlayerVO;



public interface PlayerBLService {
	public abstract ArrayList<String> getPlayrNameList();
	public abstract PlayerVO getPlayerInfo(String name);
	public ArrayList<PlayerVO> getPlayerList();
}
