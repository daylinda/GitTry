package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.demo.model.Trainee;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Trainee t1 = new Trainee(100,"D");
//		session.save(t1);
//		Trainee t2 = new Trainee(101,"E");
//		session.save(t2);
//		Trainee t3 = new Trainee(102,"F");
//		session.save(t3);
//		Trainee t4 = new Trainee(103,"G");
//		session.save(t4);
		
				
//		Trainee t = (Trainee)session.get(Trainee.class, 100);
//		System.out.println(t);
//		
//		Trainee t1 = new Trainee(101,"Updated Name");
//		session.update(t1);
//		
//		Trainee t8 = new Trainee();
//		t8.setId(100);
//		session.delete(t8);
//		
//		Trainee t1 = new Trainee("D");
//		session.save(t1);
//		Trainee t2 = new Trainee("E");
//		session.save(t2);
//		Trainee t3 = new Trainee("F");
//		session.save(t3);
//		Trainee t4 = new Trainee("G");
//		session.save(t4);
//		
		
		
		
		
		
		
		
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
