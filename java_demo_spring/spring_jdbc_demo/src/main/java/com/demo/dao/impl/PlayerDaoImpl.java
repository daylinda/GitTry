package com.demo.dao.impl;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import javax.xml.transform.Templates;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.dao.PlayerDao;
import com.demo.dao.mapper.PlayerMapper;
import com.demo.model.Player;

public class PlayerDaoImpl implements PlayerDao {
	
	private DataSource dataSource;
	private JdbcTemplate template;	
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql="select id,name,age,gender,teamName from player";
		List<Player> playerList=template.query(sql, new PlayerMapper());
		return playerList;

	}

	@Override
	public Player createPlayer(Player player) {
		String sql="insert into player(name,age,gender,teamName) values(?,?,?,?)";
		template.update(sql,player.getName(),player.getAge(),player.getGender(),player.getTeamName());
		return player;

	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,gender,teamName from player where id=?";
		Player player = template.queryForObject(sql, new Object[] {id}, new PlayerMapper());
		return player;

	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		String sql="select id,name,age,gender,teamName from player where teamName=?";
		List<Player> playerList = template.query(sql, new Object[] {teamName}, new PlayerMapper());
		return playerList;
	}

	@Override
	public void removePlayerById(int id) {
		String sql="delete from player where id=?";
		//Player player = template.queryForObject(sql, new Object[] {id}, new PlayerMapper());
		template.update(sql, new Object[] {id});
		System.out.println("Player with id "+id +" deleted");
		
	}

}
