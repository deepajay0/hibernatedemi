package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Customer c = new Customer();
		c.setId(111);
		c.setName("XYZ");
		c.setAddress("Chandauli");
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
	}
}