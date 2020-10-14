package com.wipro.services;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Problem2 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			@SuppressWarnings("unchecked")
			Query<Object[]> query = session.createQuery("SELECT c.regNo,c.manufacturer FROM Car c");
			List<Object[]> list = query.getResultList();
			System.out.println("Records retrieved are "+list.size());
			
			list.forEach(obj -> {
				Object[] o = obj;
				System.out.println("Reg no: "+o[0]+", Manufacturer: "+o[1]);
			});
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
