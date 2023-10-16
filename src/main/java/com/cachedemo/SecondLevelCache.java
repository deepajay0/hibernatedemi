package com.cachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Person;

public class SecondLevelCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Person p = session.get(Person.class, 301);
		System.out.println(p);
		session.close();

		Session session1 = factory.openSession();
		Person p1 = session1.get(Person.class, 301);
		System.out.println(p1);
	}
}
