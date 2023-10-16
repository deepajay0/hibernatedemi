package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Person;

public class HqlDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		String query = "from Person where address=:x";
		Query q = s.createQuery(query);
		q.setParameter("x", "Noida");
		List<Person> list = q.list();
		for(Person p:list) {
			System.out.println(p.getName()+" "+p.getAddress());
		}
		//delete query
		Transaction tx = s.beginTransaction(); 
//		Query q1 = s.createQuery("delete from Person where id=:x");
//		q1.setParameter("x", 302);
//		int r = q1.executeUpdate();
//		System.out.println("deleted "+r);
//		Query q2 = s.createQuery("update Person set address=:x where id=:i");
//		q2.setParameter("x", "Raipur");
//		q2.setParameter("i", 303);
//		int r = q2.executeUpdate();
//		System.out.println("updated "+r);
		//join table
		Query q3 = s.createQuery("select q.questionId,q.question,a.answer from Question q inner join q.answer a");
		List<Object[]> list2 = q3.list();
		for(Object[] arr:list2) {
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		s.close();
	}
}
