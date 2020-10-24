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
	public Department findById(Integer id) {
		return dao.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteById(Integer id) {
		Department dept = dao.findById(id).orElse(null);
		if(dept==null) {
			return false;
		}
		dao.deleteById(id);
		return true;
	}
	
	@Override
	public Department update(Department d) {
		return dao.save(d);
	}
	
	@Override
	public List<Department> findAll() {
		List<Department> list = new ArrayList<Department>();
		dao.findAll().forEach(dept -> list.add(dept));
		return list;
	}

}
