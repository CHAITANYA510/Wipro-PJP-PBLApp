package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class DataInsertion {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("com/wipro/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Flower flower = new Flower("1","Champa","White",30);
		session.save(flower);
		transaction.commit();
		System.out.println("record inserted");
		session.close();
		sf.close();
	}

}
