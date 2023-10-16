package com.hibernate.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.onetomany.Answer;
import com.hibernate.onetomany.Question;

public class CascadeDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Question q = new Question();
		q.setQuestionId(401);
		q.setQuestion("what is cascading");
		Answer a1 = new Answer(105,"first answer");
		Answer a2 = new Answer(106,"second answer");
		Answer a3 = new Answer(107,"third answer");
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q.setAnswer(list);
		Transaction tx = s.beginTransaction();
		s.save(q);
		tx.commit();
	}
}
