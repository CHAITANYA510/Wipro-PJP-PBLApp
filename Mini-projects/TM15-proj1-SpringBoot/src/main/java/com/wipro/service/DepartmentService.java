package com.wipro.service;

import java.util.List;

import com.wipro.bean.Department;

public interface DepartmentService {
	
	public Department save(Department dept);
	public Department update(Department dept);
	public Department findById(Integer id);
	public boolean deleteById(Integer id);
	public List<Department> findAll();
	
}
