package com.player.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamID;
	@OneToMany(mappedBy = "team")
	private String teamName;
	
//	List <Player> playerList = new ArrayList<>();
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamID=" + teamID + ", teamName=" + teamName + "]";
	}
	
	
	
	

}
