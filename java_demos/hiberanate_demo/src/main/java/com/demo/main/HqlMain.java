package com.demo.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;

import com.demo.model.Trainee;

public class HqlMain {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Trainee t1 = new Trainee("D",1234567890L,20,"banglore","M");
//		session.save(t1);
//		Trainee t2 = new Trainee("E",1234567880L,30,"manglore","F");
//		session.save(t2);
//		Trainee t3 = new Trainee("F",1264567899L,80,"bore","M");
//		session.save(t3);
//		Trainee t4 = new Trainee("G",1290967890L,29,"glore","F");
//		session.save(t4);
//		
		Query query = session.createQuery("from com.demo.model.Trainee"); 
		//Query query = session.createQuery("from com.demo.model.Trainee where age=:age and name like :name");
		//query.setInteger("age", 20);
		//query.setString("name", "R%");
		List<Trainee> traineeList = query.list();
		for (Trainee t : traineeList) {
			
			System.out.println(t);
			
		}
		
		
		
		
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
