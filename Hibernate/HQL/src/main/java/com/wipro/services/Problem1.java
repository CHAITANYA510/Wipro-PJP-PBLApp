package com.wipro.services;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;

public class Problem1 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		
		try {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		@SuppressWarnings("unchecked")
		Query<Car> query = session.createQuery("FROM Car");
		List<Car> list = query.getResultList();
		list.forEach(car -> System.out.println(car.toString()));
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
