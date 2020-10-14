package com.wipro.services;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.EMP;

public class EMPAdmin {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("com/wipro/resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Date d = Date.valueOf("2020-06-06");
		EMP emp = new EMP(9001,"John","CLERK",8000,d,4000.0,10.0,30);
		session.save(emp);
		transaction.commit();
		System.out.println("record inserted");
		session.close();
		sf.close();
	}
}
