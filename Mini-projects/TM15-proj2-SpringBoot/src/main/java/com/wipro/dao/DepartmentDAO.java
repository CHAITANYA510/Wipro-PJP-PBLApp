package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wipro.bean.Department;

public interface DepartmentDAO extends CrudRepository<Department,Integer>{

	public List<Department> getByDname(String dname);
	public List<Department> findByBudgetGreaterThan(double budget);
	@Transactional
	public void deleteByDname(String dname);
	//@Query(value="SELECT FROM DEPARTMENT ORDER BY BUDGET DESC",nativeQuery = true)
	@Query("FROM Department ORDER BY budget")
	public List<Department> findByDname();
	
}
