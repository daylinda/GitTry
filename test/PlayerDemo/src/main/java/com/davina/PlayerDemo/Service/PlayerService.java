package com.davina.PlayerDemo.Service;

import com.davina.PlayerDemo.DTO.PlayerDto;
import com.davina.PlayerDemo.DTO.TeamDto;

public interface PlayerService {
	
	PlayerDto createPlayer(PlayerDto playerDto);
	PlayerDto getPlayerByName(String name);
	TeamDto getTeamByName(String teamName);

}
