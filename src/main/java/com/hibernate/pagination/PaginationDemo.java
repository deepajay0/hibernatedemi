package com.hibernate.pagination;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Person;

public class PaginationDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Query q = s.createQuery("from Person",Person.class);
		int count=0;
		q.setFirstResult(count);
		q.setMaxResults(3);
		List<Person> resultList = q.getResultList();
		for(Person p:resultList) {
			System.out.println(p.getName()+" "+p.getAddress());
		}
	}
}
