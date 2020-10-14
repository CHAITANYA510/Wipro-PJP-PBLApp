package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class DataRetrieval {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("com/wipro/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Flower flower = (Flower)session.get(Flower.class, "1");
		if(flower == null) {
			System.out.println("Data not found"); 
		}
		else {
			System.out.println("Flower ID: "+flower.getFlowerID()); 
			System.out.println("Flower name: "+flower.getFlowerName());
			System.out.println("Flower color: "+flower.getColor());
			System.out.println("Flower price: "+flower.getPrice());
		}
		session.close();
		sf.close();
	}

}
