package com.wipro.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Car;

public class Problem3 {

	public static void main(String[] args) {
		
		Configuration cfg = null;
		SessionFactory sf = null;
		Session session = null;
		
		try {
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			InputStreamReader isr = new InputStreamReader(System.in);    
		    BufferedReader br = new BufferedReader(isr);    
		    @SuppressWarnings("unchecked")
			Query<Car> query = session.createQuery("FROM Car c WHERE c.regNo=?");
			System.out.print("Enter Registration number: ");
			query.setParameter(0, br.readLine());
			
			List<Car> list = query.getResultList();
			
			if(list.size()==0) {
				System.out.println("Record not found");
			}
			else {
				list.forEach(car -> System.out.println(car.toString()));
			}
			
		} 
		catch (IOException e) {
			System.out.println("Invalid input");
			e.printStackTrace();
		}
		catch (Exception e) {
			
		}
		finally {
			session.close();
			sf.close();
		}
		
	}

}
