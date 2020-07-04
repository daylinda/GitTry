package com.player.service.impl;

import java.util.List;

import com.player.dao.PlayerDao;
import com.player.dao.impl.PlayerDaoImpl;
import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	
	private PlayerDao playerDao = new PlayerDaoImpl();

	public Player createPlayer(Player player) {
		
		return playerDao.createPlayer(player);	
		
	}

	public Player updatePlayer(Player player) {
		
		return playerDao.updatePlayer(player);
	}

	public Player getPlayerById(int id) throws BusinessException {
		
		if(id<0||id>100) {
			throw new BusinessException("Player id "+ id +"is invalid");
		}
		return playerDao.getPlayerById(id);
	}

	public void removePlayer(int id) {
		
		playerDao.removePlayer(id);
		
	}

	public List<Player> getAllPlayers() {
		
		return playerDao.getAllPlayers();
	}

	public List<Player> getPlayersByName(String name) throws BusinessException {
		
		if(name.equals(null)) {
			throw new BusinessException("Please enter a valid name");
		}		
		
		return playerDao.getPlayersByName(name);
	}

	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		if(teamName.equals(null)) {
			throw new BusinessException("Please enter a valid team name");
		}		
		
		return playerDao.getPlayersByTeamName(teamName);
	}

	public List<Player> getPlayersByAgeRange(int upper, int lower) throws BusinessException {
		System.out.println("upper"+upper);
		System.out.println("lower"+lower);
		
		if(upper<0 || lower<0) {
			throw new BusinessException("Please enter a valid age range ");
		}		
		
		return playerDao.getPlayersByAgeRange(upper,lower);
	}

}
