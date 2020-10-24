package com.wipro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Admin;
import com.wipro.dao.AdminDao;

@Controller
public class ServiceClass {
	
	@Autowired
	AdminDao admindao;
	
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
			
			mv = new ModelAndView("Out");
			mv.addObject("message", "Welcome "+admin.getUsername()+"!!");
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
	
	@RequestMapping("Logout")
	public ModelAndView logout(HttpSession session){
		
		ModelAndView mv = new ModelAndView("Logout");
		
		session.setAttribute("username", null);
		session.setAttribute("password", null);
		
		return mv;
	}
	
}
