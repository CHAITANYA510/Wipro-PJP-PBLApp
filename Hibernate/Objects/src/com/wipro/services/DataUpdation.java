package com.wipro.services;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Flower;

public class DataUpdation {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		Transaction tx = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			Flower f1 = new Flower();
			System.out.print("Enter flower ID: ");
			f1.setFlowerID(sc.next());
			System.out.print("Enter flower Name: ");
			f1.setFlowerName(sc.next());
			System.out.print("Enter flower Color: ");
			f1.setColor(sc.next());
			System.out.print("Enter flower Price: ");
			f1.setPrice(sc.nextInt());
			session.update(f1);
			tx.commit();
			System.out.println("Data updated");
			
			Flower f2 = (Flower) session.get(Flower.class,f1.getFlowerID());
			if(f2!=null) {
				System.out.println("Flower ID: "+f2.getFlowerID()); 
				System.out.println("Flower name: "+f2.getFlowerName());
				System.out.println("Flower color: "+f2.getColor());
				System.out.println("Flower price: "+f2.getPrice());
			}
		}
		catch(Exception e) {
			System.out.println("Data does not exist");
			e.printStackTrace();
		}
		finally {
			sc.close();
			session.close();
			sf.close();
		}
		
	}

}
