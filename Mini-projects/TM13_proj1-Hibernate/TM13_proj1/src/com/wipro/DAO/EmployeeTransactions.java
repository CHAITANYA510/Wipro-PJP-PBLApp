package com.wipro.DAO;

import java.util.Collection;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wipro.bean.Employee;

public class EmployeeTransactions {
	
	static Configuration cfg = null;
	static SessionFactory sf = null;
	static Session session = null;
	static Transaction tx = null;
	
	public boolean addEmployee(Employee emp) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			//tx.begin();
			session.save(emp);
			tx.commit();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return false;
	}
	
	public boolean employeeExist(int empID) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			Employee emp = session.get(Employee.class, empID);
			if(emp!=null) {
			//if(emp.getID()==empID) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return false;
	}
	
	public boolean employeeExist(int empID,String name) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			
			@SuppressWarnings("unchecked")
			Query<Employee> query = session.createQuery("FROM Employee emp WHERE emp.ID=?0 and emp.name=?1");
			query.setParameter(0, empID);
			query.setParameter(1, name);
			
			List<Employee> list = query.getResultList();
			
			if(list.size()==1) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return false;
	}
	
	public boolean deleteEmployee(int empID, String name) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			
			@SuppressWarnings("unchecked")
			Query<Employee> query = session.createQuery("FROM Employee emp WHERE emp.ID=?0 and emp.name=?1");
			query.setParameter(0, empID);
			query.setParameter(1, name);
			
			List<Employee> list = query.getResultList();
			Employee emp = new Employee();
			emp.setID(empID);
			
			if(list.size()==1) {
				Session session2 = sf.openSession();
				tx = session2.beginTransaction();
				
				session2.delete(emp);
				tx.commit();
				session2.close();
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return false;
	}

	public boolean updateEmployee(Employee emp) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return false;
	}
	
	public Employee displayEmployee(int empNo) {
		
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			Employee emp = session.get(Employee.class, empNo);
			return emp;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
		return null;
	}

	public Collection<Employee> displayAllEmployee() {
	
		try {
			cfg = new Configuration();
			cfg.configure("com/wipro/resources/MyConfig.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			
			@SuppressWarnings("unchecked")
			Query<Employee> query = session.createQuery("FROM Employee");
			Collection<Employee> list = query.getResultList();
			
			if(list.size()>0) {
				return list;
			}
			else {
				return null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		return null;
	}

}
	

