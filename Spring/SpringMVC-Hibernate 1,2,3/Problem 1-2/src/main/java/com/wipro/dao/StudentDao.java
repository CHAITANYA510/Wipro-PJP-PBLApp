package com.wipro.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Student;

@Repository
@Transactional
public class StudentDao {

	@Autowired
	SessionFactory sf;
	
	@Autowired
	HibernateTemplate template;
	
	public boolean insertStudent(Student std){
		
		try {
			Integer i = (Integer)template.save(std);
			if(std.getRegNo()==i) {
				return true;
			}
			return false;
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("*******************************************8");
			System.out.println("error occured");
			System.out.println("*******************************************8");
			return false;
		}
	}
	
	public List<Student> viewStudents(){
		List<Student> list = template.loadAll(Student.class);
		return list;
	}
	
}
