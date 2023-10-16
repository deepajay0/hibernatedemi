package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificate;
import com.hibernate.Person;

public class StateDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Person p = new Person();
		p.setId(301);
		p.setName("Peter");
		p.setAddress("Noida");
		p.setCertificate(new Certificate("Spring","2 months"));
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		p.setName("John");
		tx.commit();
		s.close();
		p.setName("Dink");
		System.out.println(p);
	
	}
}
