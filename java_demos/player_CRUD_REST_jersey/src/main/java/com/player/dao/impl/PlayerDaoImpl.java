package com.player.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.player.dao.PlayerDao;
import com.player.exception.BusinessException;
import com.player.model.Player;

public class PlayerDaoImpl implements PlayerDao{
	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());
	
	public Player createPlayer(Player player) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(player);
		
		transaction.commit();
		session.close();
				
		return player;
	}

	public Player updatePlayer(Player player) {
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(player);
		
		transaction.commit();
		session.close();
		
		
		
		return player;
	}

	public Player getPlayerById(int id) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Player player = (Player) session.get(Player.class,id);
		
		transaction.commit();
		session.close();
		
		if(player == null) {
			throw new BusinessException("No player found with id "+id);
		}
		
		
		return player;
	}

	public void removePlayer(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Player p = new Player();
		p.setId(id);
		
		session.delete(p);
		
		transaction.commit();
		session.close();
		
	}

	public List<Player> getAllPlayers() {
//		List<Player> playerList = new ArrayList<Player>();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<Player> playerList = session.createQuery("from com.player.model.Player").list();
		
		transaction.commit();
		session.close();
				
		return playerList;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria crit = session.createCriteria(Player.class);
		crit.add(Restrictions.eq("name",name));
		
		List<Player> playerList = crit.list();
		
		transaction.commit();
		session.close();
		
		if(playerList.isEmpty()) {
			throw new BusinessException("No player with name "+name+" found");
		}
		
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria crit = session.createCriteria(Player.class);
		crit.add(Restrictions.eq("teamName",teamName));
		
		
		
		List<Player> playerList = crit.list();
		
		transaction.commit();
		session.close();
		
		if(playerList.isEmpty()) {
			throw new BusinessException("No player with name "+teamName+" found");
		}
		
		
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAgeRange(int upper, int lower) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria crit = session.createCriteria(Player.class);
		crit.add(Restrictions.between("age", lower, upper));
		
		List<Player> playerList = crit.list();
		
		transaction.commit();
		session.close();
		
		if(playerList.isEmpty()) {
			throw new BusinessException("No player with age range found");
		}
		
		return playerList;
	}

}
