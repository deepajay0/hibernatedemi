package com.hibernate.sqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSql {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		String q = "select * from PERSON_INFO";
		NativeQuery nq = s.createSQLQuery(q);
		List<Object[]> list = nq.list();
		for(Object[] arr:list) {
			System.out.println(arr[1]+" "+arr[2]);
		}
	}
}
