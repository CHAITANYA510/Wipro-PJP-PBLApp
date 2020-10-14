package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class DataDeletion {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			Flower f1 = new Flower();
			f1.setFlowerID("1");
			session.delete(f1);
			tx.commit();
			System.out.println("Data deleted");
		}
		catch(Exception e) {
			System.out.println("Data does not exist");
		}
		finally {
			session.close();
			sf.close();
		}
	}

}
