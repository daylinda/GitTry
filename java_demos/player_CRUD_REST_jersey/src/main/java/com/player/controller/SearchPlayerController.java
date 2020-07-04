package com.player.controller;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;
import com.player.service.impl.PlayerServiceImpl;

@Path("/players")
public class SearchPlayerController {
	
	private PlayerService playerService = new PlayerServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getAllPlayers(){
		
		return playerService.getAllPlayers();		
		
	}
	
	@GET
	@Path("/{name%}")
	//@Consumes(MediaType.APPLICATION_JSON)
	public Response getPlayersByName( @PathParam("name")String name){
		
		
		try {
			return Response.ok(playerService.getPlayersByName(name), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}		
		
	}
	
	
	@GET
	@Path("/{teamName%}")
	public Response getPlayersByTeamName(@PathParam("teamName")String teamName){
		
		try {
			return Response.ok(playerService.getPlayersByTeamName(teamName), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}		
		
	}
	
	@GET
	@Path("/{age}")
	public Response getPlayersByAgeRange(@PathParam("age")int upper,int lower){
		
		try {
			return Response.ok(playerService.getPlayersByAgeRange(upper,lower), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}		
		
	}
	
	
	
	

}
