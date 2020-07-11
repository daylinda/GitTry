package com.player.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamID;

	private String teamName;
	
	@OneToMany(mappedBy = "team",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	List <Player> playerList = new ArrayList<Player>();
	
	
	public void addPlayerToList(Player player) {
		
		this.playerList.add(player);
		
	}
	
	
	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

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
