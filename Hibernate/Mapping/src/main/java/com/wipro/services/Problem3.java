package com.wipro.services;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Continent;

public class Problem3 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			
			Map<String,String> m1 = new HashMap<String,String>();
			m1.put("India", "Delhi");
			m1.put("Pakistan","Karachi");
			
			Continent cont = new Continent("Asi",m1);
			
			session.persist(cont);
			tx.commit();
			System.out.println("Transaction successful");
		}
		catch (Exception e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
	}

}
