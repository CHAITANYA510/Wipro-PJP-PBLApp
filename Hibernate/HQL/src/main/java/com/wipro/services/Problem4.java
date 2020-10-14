package com.wipro.services;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Problem4 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			@SuppressWarnings("unchecked")
			Query<String> query = session.createQuery("SELECT c.manufacturer FROM Car c WHERE c.manufacturer LIKE 'V%'");
			List<String> list = query.getResultList();
			System.out.println("Records retrieved are "+list.size());
			System.out.println("Manufacturer's name starting with 'V' are:");
			list.forEach(s -> System.out.println(s));
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
