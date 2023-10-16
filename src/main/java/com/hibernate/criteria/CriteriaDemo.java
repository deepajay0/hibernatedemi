package com.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Person;

public class CriteriaDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Criteria c = s.createCriteria(Person.class);
//		c.add(Restrictions.eq("name", "John"));
		c.add(Restrictions.ge("fees", 4000));
		List<Person> list = c.list();
		for(Person p:list) {
			System.out.println(p);
		}
	}
}
