package com.demo.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.PlayerDao;
import com.demo.model.Player;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
		PlayerDao dao=(PlayerDao) context.getBean("dao");
		
//		dao.createPlayer(new Player("Sachin", "India", 41, "M"));
//		System.out.println(dao.getPlayerById(3));
		
//		List<Player> playerList=dao.getAllPlayers();
//		for(Player p:playerList) {
//			System.out.println(p);
//		}
	}

}
