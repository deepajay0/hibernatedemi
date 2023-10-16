package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Question q = new Question();
		q.setQuestionId(101);
		q.setQuestion("what is java");
		Answer a = new Answer();
		a.setAnswerId(201);
		a.setAnswer("java is programming language");
		q.setAnswer(a);
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q);
		s.save(a);
		tx.commit();
		s.close();
		factory.close();
	}

}
