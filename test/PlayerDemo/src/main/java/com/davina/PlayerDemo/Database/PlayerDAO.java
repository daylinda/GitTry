package com.davina.PlayerDemo.Database;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.davina.PlayerDemo.DTO.PlayerDto;
import com.davina.PlayerDemo.Entity.Player;
import com.davina.PlayerDemo.Entity.Team;

@Repository
public class PlayerDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Transactional  //by adding this annotation , u dont need to explicitly add session.beginTransaction() or session.getTransaction().commit()
	public void createPlayer(PlayerDto playerDto)  {
		//The PlayerDto object "playerDto" is only used as a source of data. it is not passed to DB.
		
		Team team = this.getTeam(playerDto.getTeamName());
		
		System.out.println(team);
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		if( team == null ) //i.e. if team doesnt exist 
 		{
			 team = new Team();
			 team.setTeamName(playerDto.getTeamName());
			 currentSession.saveOrUpdate(team);
			 
		}
		
		Player player = new Player();
		player.setName(playerDto.getName());
		player.setGender(playerDto.getGender());
		player.setAge(playerDto.getAge());
		
		team.addPlayer(player);
		currentSession.saveOrUpdate(player);
		
	
		
	}
	
	@Transactional  //by adding this annotation , u dont need to explicitly add session.beginTransaction() or session.getTransaction().commit()
	public Team getTeam(String teamName)
	{
		
		List<Team> teamList = new ArrayList<>();
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Team> theQuery = currentSession.createQuery("from Team t where t.teamName = :teamName", Team.class);
		theQuery.setParameter("teamName",teamName);
		
		
		teamList = theQuery.getResultList();
		
		
		if( teamList.size() == 0)
			return null;  //if no such team exists
		
		
		return teamList.get(0); 
	}

	
	@Transactional   //by adding this annotation , u dont need to explicitly add session.beginTransaction() or session.getTransaction().commit() 
	public Player getPlayer(String name) {
		
		List<Player> playerList = new ArrayList<>();
		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Player> theQuery = currentSession.createQuery("from Player p where p.name = :name", Player.class);
		theQuery.setParameter("name",name);
		
		playerList = theQuery.getResultList();
		
		if(playerList.size() == 0) return null; //if no such player exists
		
	
		
		return playerList.get(0);
		
	}
	
	
}
