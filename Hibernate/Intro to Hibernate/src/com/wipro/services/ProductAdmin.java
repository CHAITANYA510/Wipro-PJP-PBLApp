package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Product;

public class ProductAdmin {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/wipro/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Product p1 = new Product();
		p1.setProductName("AAA");
		p1.setPrice(300);
		session.save(p1);
		tx.commit();
		System.out.println("record inserted");
		session.close();
		sf.close();
	}

}
