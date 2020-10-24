package com.wipro.controller;

import java.util.List;

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
	
	@RequestMapping("/deleteDeptByName")
	public String deleteDept(Department dept, Model m) {
		boolean deptDeleted = service.deleteByDname(dept.getDname());
		if(deptDeleted) {
			m.addAttribute("message", "Department with given name: "+dept.getDname()+" is deleted!!");
			return "Out";
		}
		m.addAttribute("message", "Department with name: "+dept.getDname()+" does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/showDeptByName")
	public String displayDept(Department dept, Model m) {
		
		List<Department> deptList = service.getByDname(dept.getDname());
		if(deptList.size()!=0) {
			m.addAttribute("message", "Department by Name");
			m.addAttribute("deptName", dept.getDname());
			m.addAttribute("deptList", deptList);
			return "DisplayByDName";
		}
		m.addAttribute("message", "Department with name: "+dept.getDname()+" does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/showDeptBudgetGreaterThan")
	public String showDeptBudgetGreaterThan(Department dept, Model m) {
		
		List<Department> deptList = service.findByBudgetGreaterThan(dept.getBudget());
		if(deptList.size()!=0) {
			m.addAttribute("message", "Display All Department Where budget greater than "+dept.getBudget());
			m.addAttribute("DeptList", deptList);
			return "DisplayAll";
		}
		m.addAttribute("message", "Departments with budget greater than "+dept.getBudget()+" does not exist!!");
		return "Out";
	}
	
	@RequestMapping("/displayallOrdered")
	public String displayAllDept(Model m) {
		
		List<Department> deptList = service.findByDname();
		if(deptList.size()!=0) {
			m.addAttribute("message", "Display All Department Order By Budget");
			m.addAttribute("DeptList",deptList);
			return "DisplayAll";
		}
		m.addAttribute("message", "No Departments found!!");
		return "Out";
	}
	
	@RequestMapping("/displayallUnOrdered")
	public String displayAllUnsorted(Model m) {
		
		List<Department> deptList = service.findAll();
		if(deptList.size()!=0) {
			m.addAttribute("message", "Display All Department in order of entry");
			m.addAttribute("DeptList",deptList);
			return "DisplayAll";
		}
		m.addAttribute("message", "No Departments found!!");
		return "Out";
	}
}
