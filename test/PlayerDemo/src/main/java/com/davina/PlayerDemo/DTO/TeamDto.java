package com.davina.PlayerDemo.DTO;

import java.util.ArrayList;
import java.util.List;

public class TeamDto {

	private String teamName;
	private List<PlayerDto> players;
	
	public TeamDto()
	{
		
	}
	
	
	
	public TeamDto(String teamName, List<PlayerDto> players) {
		this.teamName = teamName;
		this.players = players;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<PlayerDto> getPlayers() {
		return players;
	}
	public void setPlayers(List<PlayerDto> players) {
		this.players = players;
	}


	public void addPlayer(PlayerDto player)
	{
		 if (players == null)
			 players  = new ArrayList<>();
		
		 player.setTeamName(this.getTeamName());
		 players.add(player);
	}

	@Override
	public String toString() {
		return "TeamDto [teamName=" + teamName + ", players=" + players + "]";
	}
	
	
	
	
}
