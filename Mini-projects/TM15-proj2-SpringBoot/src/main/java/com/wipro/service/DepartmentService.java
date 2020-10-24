package com.wipro.service;

import java.util.List;

import com.wipro.bean.Department;

public interface DepartmentService {
	
	public Department save(Department dept);
	public boolean deleteByDname(String dname);
	public List<Department> findAll();
	public List<Department> getByDname(String dname);
	public List<Department> findByBudgetGreaterThan(double budget);
	public List<Department> findByDname();
	
}
