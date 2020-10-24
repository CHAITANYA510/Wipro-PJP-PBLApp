package com.wipro.dao;

import org.springframework.data.repository.CrudRepository;

import com.wipro.bean.Department;

public interface DepartmentDAO extends CrudRepository<Department,Integer>{

}
