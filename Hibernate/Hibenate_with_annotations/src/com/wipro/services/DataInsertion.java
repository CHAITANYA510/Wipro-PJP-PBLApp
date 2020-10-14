package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;

public class DataInsertion {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("com/wipro/resources/myconfig.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Car car = new Car("KL-08","AB 234 Vento","Black","Volkswagen");
		session.save(car);
		transaction.commit();
		System.out.println("record inserted");
		session.close();
		sf.close();
	}

}
