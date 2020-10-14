package com.wipro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDao;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("PreInsert")
	public ModelAndView preInsertStudent() {
		
		Student student = new Student();
		ModelAndView mv = new ModelAndView("Problem1","student",student);
		
		return mv;
	}
	
	@RequestMapping("PostInsert")
	public ModelAndView insertStudent(@ModelAttribute("student") Student student) {
		
		ModelAndView mv = new ModelAndView("Problem1Result","student",student);
		
		if(dao.insertStudent(student)) {
			mv.addObject("message1","Insertion successful");
		}
		else {
			mv.addObject("message1","Insertion failed");
			mv.addObject("message2","Student with given reg number already exist!!");
		}
			 
		return mv;
		
	}
	
	@RequestMapping("ViewStudents")
	public ModelAndView viewStudents(){
		
		ArrayList<Student> list = (ArrayList<Student>) dao.viewStudents();
		ModelAndView mv = new ModelAndView("Problem2Result","studentlist",list);
		return mv;
	}
	
}
