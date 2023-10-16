package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MapsDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Empl e1 = new Empl();
		Empl e2 = new Empl();
		
		Projects p1 = new Projects();
		Projects p2 = new Projects();
		e1.setEid(101);
		e1.setName("ajay");
		e2.setEid(102);
		e2.setName("tri");
		p1.setPid(12121);
		p1.setPname("Library System");
		
		p2.setPid(456);
		p2.setPname("chatbot");
		List<Empl> list1 = new ArrayList<Empl>();
		List<Projects> list2 = new ArrayList<Projects>();
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		e1.setProject(list2);
		p2.setEmp(list1);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		tx.commit();
		s.close();
		factory.close();
	}
}
