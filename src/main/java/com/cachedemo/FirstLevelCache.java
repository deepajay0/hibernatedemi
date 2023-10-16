package com.cachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Person;

public class FirstLevelCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 Session session = factory.openSession();
		 Person p = session.get(Person.class, 301);
		 System.out.println(p);
		 System.out.println("working something");
		 Person p1 = session.get(Person.class, 301);
		 System.out.println(p1);
		 System.out.println(session.contains(p1));
		 session.close();
		 System.out.println(session.contains(p1));
	}
}
