package com.wipro.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Coupon;
import com.wipro.bean.Customer;

@Repository
@Transactional
public class AddRecords {

	@Autowired
	SessionFactory sf;
	
	@Autowired
	HibernateTemplate template;
	
	public void addCustomers(Customer c) {
		System.out.println(c);
		template.save(c);
	}
	
	public void addCoupons(Coupon c) {
		System.out.println(c);
		template.save(c);
	}
	
	public static void main(String[] args) {
		
		AddRecords add = new AddRecords();

		add.addCustomers(new Customer("Cust001","Cust001pass",9000));
		add.addCustomers(new Customer("Cust002","Cust002pass",15000));
		add.addCustomers(new Customer("Cust003","Cust003pass",500));
		add.addCustomers(new Customer("Cust004","Cust004pass",20000));
		add.addCustomers(new Customer("Cust005","Cust005pass",850));
		
		add.addCoupons(new Coupon("NY2020-00",0));
		add.addCoupons(new Coupon("NY2020-05",5));
		add.addCoupons(new Coupon("NY2020-10",10));
		add.addCoupons(new Coupon("NY2020-20",20));
	}

}
