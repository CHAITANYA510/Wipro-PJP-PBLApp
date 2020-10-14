package com.wipro.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Coupon;
import com.wipro.bean.Customer;

import com.wipro.dao.CouponDao;
import com.wipro.dao.CustomerDao;

@Controller
public class ServiceClass {
	
	@Autowired
	CouponDao coupondao;
	
	@Autowired
	CustomerDao customerdao;
	
	@RequestMapping("PreLogin")
	public ModelAndView preLogin() {			
		
		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}
	
	@RequestMapping("Login")
	public ModelAndView login(@ModelAttribute("customer") Customer customer, HttpSession session) {
		
		ModelAndView mv;
		System.out.println("customer data recieved: "+customer);
		
		if(customer.getCustomerID()=="" || customer.getPassword()=="") {
			mv = new ModelAndView("Login");
			mv.addObject("message", "Username or password not provided!!");
		}
		
		else if(customerdao.customerExist(customer)=="success") {
			
			session.setAttribute("customerID", customer.getCustomerID());
			session.setAttribute("password", customer.getPassword());
			
			float currentBalance = customerdao.getBalance(customer.getCustomerID());
			
			mv = new ModelAndView("CouponInput");
			mv.addObject("balance", currentBalance);
		}	
		
		else if(customerdao.customerExist(customer)=="usernotfound") {
			mv = new ModelAndView("Login");
			mv.addObject("message", "User with given name not found!!");
		}	
		
		else {
			mv = new ModelAndView("Login");
			mv.addObject("message", "Incorrect credentials!!");
		}
		
		return mv;
	}
	
	
	@RequestMapping("CouponInput")
	public ModelAndView couponInput(@ModelAttribute("coupon") Coupon coupon, HttpSession session) {
		
		ModelAndView mv;
		ValidateLogin v1 = new ValidateLogin(session);
		System.out.println("coupon recieved: "+coupon);
		
		if(v1.isLoggedIn()) {
			
			String custID = (String) session.getAttribute("customerID");
			float currentBalance = customerdao.getBalance(custID);
			
			if(coupondao.validCode(coupon)) {
				
				float discountPercentage = coupondao.getDiscountPercentage(coupon);
				
				float updatedBal = currentBalance + (currentBalance*discountPercentage/100);
				
				customerdao.updateBalance(custID,updatedBal);
				
				mv = new ModelAndView("Out");
				mv.addObject("percentage", discountPercentage);
				mv.addObject("previousbalance", currentBalance);
				mv.addObject("updatedbalance", updatedBal);
				return mv;
			}
			else {
				mv = new ModelAndView("CouponInput");
				mv.addObject("message", "Invalid coupon code!!");
				mv.addObject("balance", currentBalance);
				return mv;
			}
			
		}
		
		//System.out.println("not logged in");
		mv = preLogin();
		mv.addObject("message", "Login Before Registering data!!");
		return mv;
	}
	
	
	@RequestMapping("Logout")
	public ModelAndView logout(HttpSession session){
		
		ModelAndView mv = new ModelAndView("Logout");
		
		session.setAttribute("CustomerID", null);
		session.setAttribute("password", null);
		
		return mv;
	}
	
}
