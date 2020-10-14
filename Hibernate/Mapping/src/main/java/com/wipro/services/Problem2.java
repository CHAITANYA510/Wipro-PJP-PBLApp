package com.wipro.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;
import com.wipro.bean.MultiCarOwner;

public class Problem2 {

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
			
			List<Car> cars = new ArrayList<Car>();
			Car car = null;
			car = new Car("KL-14","SCBA","Gold","Tata");
			cars.add(car);
			car = new Car("KL-15","TCBA","Grey","Porse");
			cars.add(car);
			
			MultiCarOwner owner = new MultiCarOwner(100,"Demo1",cars);
			
			session.persist(owner);
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
