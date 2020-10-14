package com.wipro.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;
import com.wipro.bean.Passport;


public class Problem4 {

	static Configuration cfg = null;
	static SessionFactory sf = null;
	static Session session = null;
	static Transaction tx = null;
	
	static String insertData() {
		
		Passport passport = new Passport(91, "India");
		Employee emp = new Employee("emp1",1,passport);
		
		session.save(passport);
		session.save(emp);
		tx.commit();
		
		System.out.println("data saved");
		return emp.toString();
	}
	
	static String deleteData() {
		
		Employee emp = session.get(Employee.class, "emp1");
		Passport pass = session.get(Passport.class, emp.getPassport().getCountry_code());
		
		session.delete(emp);
		session.delete(pass);
		tx.commit();
		
		return "data deleted";
	}
	
	public static void main(String[] args) {

		try {
			
			cfg = new Configuration().configure();
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			
			//System.out.println(insertData());
			System.out.println(deleteData());
			
		}
		catch(Exception e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
	}

}
