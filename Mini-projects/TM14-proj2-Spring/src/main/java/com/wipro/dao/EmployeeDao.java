package com.wipro.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.hibernate.SessionFactory;

import com.wipro.bean.Employee;

@Repository
@Transactional
public class EmployeeDao {
	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	HibernateTemplate template;
	
	public boolean employeeExist(int empID) {
		
		Employee emp = template.get(Employee.class, empID);
		if(emp!=null) {
			return true;
		}
		return false;	
	}
	
	public Employee getEmployee(int ID) {
		
		Employee emp = (Employee) template.get(Employee.class, ID);
		if(emp==null) {
			return null;
		}
		return emp;
	}

	public boolean addEmployee(Employee em) {
		
		Employee emp = (Employee) template.get(Employee.class, em.getID());
		//System.out.println("Employee retrieved: "+emp);
		if(emp!=null) {
			//System.out.println(admin.getEmpno()+":::"+ad.getUsername());
			if(em.getID() == emp.getID()) {
				return false;
			}
		}
		//System.out.println("employee to be saved "+em);
		template.save(em);
		return true;		
	}

	public boolean deleteEmployee(int empID) {
		
		Employee emp = (Employee) template.get(Employee.class, empID);
		//System.out.println("Employee retrieved: "+emp);
		if(emp!=null) {
			template.delete(emp);
			return true;
		}
		return false;
	}

	public boolean updateEmployee(Employee em) {
		
		Employee emp = (Employee) template.get(Employee.class, em.getID());
		System.out.println("Employee retrieved: "+emp);
		if(emp!=null) {
			template.merge(em);
			return true;
		}
		return false;
	}
	
	public List<Employee> getAllEmployee() {
		
		List<Employee> emp = template.loadAll(Employee.class);
		return emp;
	}
}
	

