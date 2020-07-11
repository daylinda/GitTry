package com.davina.PlayerDemo.DTO;

public class PlayerDto {
	
	private String name;
	private String gender;
	private int age;
	private String teamName;
	
	public PlayerDto()
	{
		
	}
	
	
	public PlayerDto(String name, String gender, int age, String teamName) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.teamName = teamName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String toString() {
		return "PlayerDto [name=" + name + ", gender=" + gender + ", age=" + age + ", teamName=" + teamName + "]";
	}
	
	

}
