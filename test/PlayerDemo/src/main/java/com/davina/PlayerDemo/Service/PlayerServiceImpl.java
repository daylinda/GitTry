package com.davina.PlayerDemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davina.PlayerDemo.DTO.PlayerDto;
import com.davina.PlayerDemo.DTO.TeamDto;
import com.davina.PlayerDemo.Database.PlayerDAO;
import com.davina.PlayerDemo.Entity.Player;
import com.davina.PlayerDemo.Entity.Team;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	PlayerDAO playerDB;
	
	
	@Override
	public PlayerDto createPlayer(PlayerDto playerDto) {
		
		playerDB.createPlayer(playerDto);
		
		
		
		PlayerDto returnVal = this.getPlayerByName(playerDto.getName());

		System.out.println(returnVal);
		
		return returnVal;
	}


	@Override
	public PlayerDto getPlayerByName(String name) {
		
		Player player = playerDB.getPlayer(name);
		
		if (player == null) throw new RuntimeException("Player not found");
		
		PlayerDto returnVal = new PlayerDto();

		
		returnVal.setName(player.getName());
		returnVal.setAge(player.getAge());
		returnVal.setGender(player.getGender());
		returnVal.setTeamName(player.getTeam().getTeamName());
		
		
		return returnVal;
	}


	@Override
	public TeamDto getTeamByName(String teamName) {
		
		Team team = playerDB.getTeam(teamName);
		
		if (team == null) throw new RuntimeException("team not found");
		
		TeamDto teamDto = new TeamDto();
		
		teamDto.setTeamName(team.getTeamName());
		
		
		for(Player player: team.getPlayers())
		{
			PlayerDto playerDto = new PlayerDto();
			
			playerDto.setName(player.getName());
			playerDto.setAge(player.getAge());
			playerDto.setGender(player.getGender());
			playerDto.setTeamName(player.getTeam().getTeamName());
			
			teamDto.addPlayer(playerDto);
			
		}
		
		
		return teamDto;
	}
	
	
	

	
	
}
