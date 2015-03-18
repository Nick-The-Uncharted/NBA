package entity;


public class TeamVO {
	String abbv;  //球队名称缩写
	String name;  //球队名称
	String city;   //所在地
	String conference; //赛区
	String division;  //分区
	String arena;  //主场
	String foundyear;  //创建年份
	TeamDataVO data;
	
	public TeamVO(String name){
		data=new TeamDataVO(name);
	}
	
	public String getAcronym() {
		return abbv;
	}
	public void setAcronym(String acronym) {
		this.abbv = acronym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return city;
	}
	public void setLocation(String location) {
		this.city = location;
	}
	public String getConference() {
		return conference;
	}
	public void setConference(String conference) {
		this.conference = conference;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getHomecourt() {
		return arena;
	}
	public void setHomecourt(String homecourt) {
		this.arena = homecourt;
	}
	public String getFoundyear() {
		return foundyear;
	}
	public void setFoundyear(String foundyear) {
		this.foundyear = foundyear;
	}
	
	
}
