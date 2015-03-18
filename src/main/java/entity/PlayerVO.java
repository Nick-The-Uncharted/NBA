package entity;

import java.util.ArrayList;


public class PlayerVO {
	String name;
	String number;
	ArrayList<Character> positions;
	float height;
	float weight;
	String birth;
	int age;
	int exp;
	String school; 
	PlayerDataVO data;
	
	public PlayerVO(String name){
		data=new PlayerDataVO(name); 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public ArrayList<Character> getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<Character> positions) {
		this.positions = positions;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
	

}
