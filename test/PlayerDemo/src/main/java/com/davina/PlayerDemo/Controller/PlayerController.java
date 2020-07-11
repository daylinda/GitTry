package com.davina.PlayerDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davina.PlayerDemo.DTO.PlayerDto;
import com.davina.PlayerDemo.DTO.TeamDto;
import com.davina.PlayerDemo.Service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {

	
	@Autowired
	PlayerService playerService;
	
	
	@PostMapping(produces=  MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PlayerDto createPlayer(@RequestBody PlayerDto playerDto)
	{
		
		playerDto = playerService.createPlayer(playerDto);
		
		
		return playerDto;
	}
	
	@GetMapping(path="/{name}",produces=  MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public PlayerDto getPlayerByName(@PathVariable String name)
	{
		//if multiple players with same name are present this will return only first fetched value.
		
		return playerService.getPlayerByName(name);
	}
	
	
	@GetMapping(path="/team/{teamName}",produces=  MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public TeamDto getTeamByName(@PathVariable String teamName)
	{
		
		return playerService.getTeamByName(teamName);
	}
	
	
	
	
	
	
	
	
}
