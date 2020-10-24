package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bean.Department;
import com.wipro.dao.DepartmentDAO;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentDAO dao;
	
	@Override
	public Department save(Department d) {
		return dao.save(d);
	}
	
	@Override
	public boolean deleteByDname(String dname) {
		if(dao.getByDname(dname).size() == 0){
			return false;
		}
		dao.deleteByDname(dname);
		return true;
	}

	@Override
	public List<Department> getByDname(String dname) {
		return dao.getByDname(dname);
	}

	@Override
	public List<Department> findByBudgetGreaterThan(double budget) {
		return dao.findByBudgetGreaterThan(budget);
	}

	@Override
	public List<Department> findByDname() {
		List<Department> list = new ArrayList<Department>();
		dao.findByDname().forEach(dept -> list.add(dept));
		return list;
	}

	@Override
	public List<Department> findAll() {
		List<Department> list = new ArrayList<Department>();
		dao.findAll().forEach(dept -> list.add(dept));
		return list;
	}

}
