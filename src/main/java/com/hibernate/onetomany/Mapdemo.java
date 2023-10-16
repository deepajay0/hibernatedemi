package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapdemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Question q = new Question();
//		q.setQuestionId(101);
//		q.setQuestion("what is java");
//		
//		Answer a = new Answer();
//		a.setAnswerId(501);
//		a.setAnswer("java is a programming language");
//		a.setQ(q);
//		Answer a1 = new Answer();
//		a1.setAnswerId(502);
//		a1.setAnswer("it is widely used");
//		a1.setQ(q);
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(a);
//		list.add(a1);
//		q.setAnswer(list);
		Session s = factory.openSession();
//		Transaction tx = s.beginTransaction();
//		s.save(q);
//		s.save(a);
//		s.save(a1);
//		tx.commit();
		Question q = (Question)s.get(Question.class, 101);
		//System.out.println(q);
		System.out.println(q.getQuestion());
		System.out.println(q.getQuestionId());
		System.out.println(q.getAnswer().size());
		
		s.close();
		factory.close();
	}
}
