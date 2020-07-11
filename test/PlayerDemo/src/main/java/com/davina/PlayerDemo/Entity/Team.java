package com.davina.PlayerDemo.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "team")
public class Team {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "team_name")
	private String teamName;
	
	@JsonManagedReference
	@OneToMany(mappedBy="team", fetch = FetchType.EAGER,
			  cascade={ CascadeType.DETACH, 
						CascadeType.MERGE, 
						CascadeType.PERSIST, 
						CascadeType.REFRESH })
	private List<Player> players;

	
	public Team()
	{
		
	}
	
	public Team(int id, String teamName, List<Player> players) {
		this.id = id;
		this.teamName = teamName;
		this.players = players;
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
	
	public void addPlayer(Player player)
	{
		if(players == null)
			players = new ArrayList<>();
			
		player.setTeam(this);
		players.add(player);
		
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName   + "]";
	}

	
}
