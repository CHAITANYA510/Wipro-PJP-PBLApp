package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;
import com.wipro.bean.CarOwner;

public class Problem1 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		Car car = new Car("KL-11","CBA","Silver","Maruti");
		CarOwner owner = new CarOwner(100,"Raj",car);
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			session.persist(owner.getCar());
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
