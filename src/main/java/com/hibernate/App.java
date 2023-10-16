package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Person p = new Person();
        p.setId(3);
        p.setName("ajay");
        p.setAddress("chandauli");
        Certificate c = new Certificate();
        c.setCoursename("Java");
        c.setFees("1254");
        p.setCertificate(c);
        Address a = new Address();
        a.setAddressId(102);
        a.setCity("Chandauli");
        a.setStreet("Kaili road");
        a.setAddedDate(new Date());
        a.setOpen(false);
        a.setX(124.12);
        FileInputStream fis = new FileInputStream("src/main/java/wonka.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        a.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(p);
        session.save(a);
        tx.commit();
        session.close();
        factory.close();
        
    }
}
