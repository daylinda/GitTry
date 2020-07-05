package com.demo.model;

public class Team {
	private int tid;
	private String teamName;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", teamName=" + teamName + "]";
	}
	public Team(int tid, String teamName) {
		super();
		this.tid = tid;
		this.teamName = teamName;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
