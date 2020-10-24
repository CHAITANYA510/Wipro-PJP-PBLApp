package com.wipro.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Admin;
import com.wipro.bean.Employee;

import com.wipro.dao.AdminDao;
import com.wipro.dao.EmployeeDao;

@Controller
public class ServiceClass {
	
	@Autowired
	AdminDao admindao;
	
	@Autowired
	EmployeeDao employeedao;
	
	@RequestMapping("PreLogin")
	public ModelAndView preLogin() {			
		
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
	
	@RequestMapping("Login")
	public ModelAndView login(@ModelAttribute("admin") Admin admin, HttpSession session) {
		
		ModelAndView mv;
		
		if(admin.getUsername()=="" || admin.getPassword()=="") {
			mv = new ModelAndView("Login");
			mv.addObject("message", "Username or password not provided!!");
		}
		
		else if(admindao.userExist(admin)=="success") {
			
			session.setAttribute("username", admin.getUsername());
			session.setAttribute("password", admin.getPassword());
			
			mv = new ModelAndView("Menu");
			mv.addObject("message", admin.getUsername());
		}	
		
		else if(admindao.userExist(admin)=="usernotfound") {
			mv = new ModelAndView("Login");
			mv.addObject("message", "User with given name not found!!");
		}	
		
		else {
			mv = new ModelAndView("Login");
			mv.addObject("message", "Incorrect credentials!!");
		}
		
		return mv;
	}
	
	@RequestMapping("PreRegister")
	public ModelAndView preRegister() {
		
		Admin admin = new Admin();
		ModelAndView mv = new ModelAndView("Register","admin",admin);
		return mv;	
		
	}
	
	@RequestMapping("Register")
	public ModelAndView adminRegistration(@ModelAttribute("admin") Admin admin) {
		
		ModelAndView mv;
		
		if(admindao.registerAdmin(admin)) {
			mv = preLogin();
			mv.addObject("message", "Registration successful!! Login now");
		}	
		else {
			mv = preRegister();
			mv.addObject("message", "Registration failed!! Retry");
		}
		
		return mv;
	}
	
	@RequestMapping("Menu")
	public ModelAndView menu(HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			mv = new ModelAndView("Menu");
			return mv;
		}
		
		///System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("PreAdd")
	public ModelAndView preAdd(HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			Employee emp = new Employee();
			mv = new ModelAndView("Add","employee",emp);
			return mv;
		}
		
		///System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
		
	}
	
	@RequestMapping("Add")
	public ModelAndView add(@ModelAttribute("employee") Employee emp, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			if(employeedao.addEmployee(emp)) {
				mv = new ModelAndView("Out");
				mv.addObject("message", "Employee added successfully");
				return mv;
			}	
			else {
				mv = preRegister();
				mv.addObject("message", "Employee Registration failed!! Retry");
				return mv;
			}
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
		
	}
	
	@RequestMapping("PreDelete")
	public ModelAndView preDelete(HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			mv = new ModelAndView("Delete");
			return mv;
		}
		
		///System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView delete(@ModelAttribute("employee") Employee emp, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			
			if(employeedao.deleteEmployee(emp.getID())) {
				mv = new ModelAndView("Out");
				mv.addObject("message", "Employee deleted successfully");
				return mv;
			}	
			else {
				mv = preDelete(session);
				mv.addObject("message", "Employee deletion failed!! Retry");
				return mv;
			}
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("PreUpdate")
	public ModelAndView preUpdate(HttpSession session) {
		
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			ModelAndView mv = new ModelAndView("PreUpdate");
			return mv;
		}
		
		///System.out.println("not logged in");
		ModelAndView mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("Update1")
	public ModelAndView update1(@ModelAttribute("employee") Employee em, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			Employee emp = employeedao.getEmployee(em.getID());
			
			if(emp!=null) {
				mv = new ModelAndView("Update","emp",emp);
				mv.addObject(emp);
				return mv;
			}
			else {
				System.out.println("deos not exist");
				mv = preUpdate(session);
				mv.addObject("message", "Employee with given empID does not exist!!");
				return mv;
			}
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("Update2")
	public ModelAndView update2(@ModelAttribute("employee") Employee em, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			
			System.out.println("employee received to update: "+em);
			if(employeedao.updateEmployee(em)) {
				mv = new ModelAndView("Out");
				mv.addObject("message", "Employee updated successfully");
				return mv;
			}	
			else {
				mv = preUpdate(session);
				mv.addObject("message", "Employee updation failed!! Retry");
				return mv;
			}
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("PreDisplay")
	public ModelAndView preDisplay(HttpSession session) {
		
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			
			ModelAndView mv = new ModelAndView("PreDisplay");
			return mv;
		}
		
		///System.out.println("not logged in");
		ModelAndView mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("Display")
	public ModelAndView display(@ModelAttribute("employee") Employee emp, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			if(employeedao.employeeExist(emp.getID())) {
				Employee em = employeedao.getEmployee(emp.getID());
				mv = new ModelAndView("Display","emp",em);
				return mv;
			}
			else {
				mv = new ModelAndView("PreDisplay");
				mv.addObject("message", "Employee with given empID does not exist!!");
				return mv;
			}
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("DisplayAll")
	public ModelAndView displayAll(HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		
		if(v1.isLoggedIn()) {
			List<Employee> emList = employeedao.getAllEmployee();
			mv = new ModelAndView("DisplayAll","empList",emList);
			return mv;
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	@RequestMapping("Logout")
	public ModelAndView logout(HttpSession session){
		
		ModelAndView mv = new ModelAndView("Logout");
		
		session.setAttribute("username", null);
		session.setAttribute("password", null);
		
		return mv;
	}
	
}
