package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.bean.Department;
import com.wipro.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@RequestMapping("/")
	public String showIndex(Model m) {
		return "menu";
	}
	
	@RequestMapping("/menu")
	public String showMenu(Model m) {
		return "menu";
	}
	
	@RequestMapping("/home")
	public String showHome(Model m) {
		return "menu";
	}
	
	@RequestMapping("/add")
	public String showSaveForm() {
		return "menu";
	}

	@RequestMapping("/display")
	public String showDisplayForm() {
		return "menu";
	}
	
	@RequestMapping("/delete")
	public String showDeleteForm() {
		return "menu";
	}
	
	@RequestMapping("/update")
	public String showUpdateForm() {
		return "menu";
	}

	@RequestMapping("/displayAll")
	public String showAll(Model m) {
		m.addAttribute("DeptList",service.findAll());
		return "DisplayAll";
	}
	
	@RequestMapping("/addDept")
	public String addDept(Department dept, Model m) {
		service.save(dept);
		m.addAttribute("message","Department added successfully!!");
		return "Out";
	}				
	
	@RequestMapping("/showDept")
	public String displayDept(Department dept, Model m) {
		
		Department d = service.findById(dept.getDeptno());
		if(d!=null) {
			m.addAttribute("dept", d);
			m.addAttribute("message", "Department Information");
			return "DisplayDept";
		}
		m.addAttribute("message", "Department with given ID does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/deleteDept")
	public String deleteDept(Department dept, Model m) {
		boolean deptDeleted = service.deleteById(dept.getDeptno());
		if(deptDeleted) {
			m.addAttribute("message", "Department with given ID is deleted!!");
			return "Out";
		}
		m.addAttribute("message", "Department with given ID does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/getDept")
	public String showDeptToUpdate(Department dept, Model m) {
		Department out = service.findById(dept.getDeptno());
		if(out!=null) {
			m.addAttribute("dept", out);
			return "UpdateDept";
		}
		m.addAttribute("message", "Department with given ID does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/updateDept")
	public String updateDept(Department dept, Model m) {
		
		Department d = service.update(dept);
		m.addAttribute("message","Department updated!!");
		m.addAttribute("dept", d);
		return "DisplayDept";
	}
	
	@RequestMapping("/showAll")
	public String displayAllDept(Model m) {
		m.addAttribute("DeptList",service.findAll());
		return "DisplayAll";
	}
	
}
