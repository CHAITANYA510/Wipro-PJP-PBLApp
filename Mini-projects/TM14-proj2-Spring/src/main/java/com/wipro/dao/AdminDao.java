package com.wipro.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Admin;

@Repository
@Transactional
public class AdminDao {

	@Autowired
	SessionFactory sf;
	
	@Autowired
	HibernateTemplate template;
	
	public String userExist(Admin ad) {
		
		Admin admin = (Admin) template.get(Admin.class, ad.getUsername());
		
		if(admin!=null) {
			if(ad.getUsername().equals(admin.getUsername()) && ad.getPassword().equals(admin.getPassword())) {
				return "success";
			}
			else {
				return "incorrectcredentials";
			}
		}
		
		else {
			return "usernotfound";
		}
		
	}

	public Admin getUserCredentials(Admin ad) {
		
		Admin admin = (Admin) template.get(Admin.class, ad.getUsername());
		
		if(admin!=null) {
			if(ad.getUsername().equals(admin.getUsername()) && ad.getPassword().equals(admin.getPassword())) {
				return ad;
			}
		}
		
		return null;
	}

	public boolean registerAdmin(Admin ad) {
		
		Admin admin = (Admin) template.get(Admin.class, ad.getUsername());
		
		if(admin!=null) {
			System.out.println(admin.getEmpno()+":::"+ad.getUsername());
			if(admin.getUsername().equals(ad.getUsername())) {
				return false;
			}
		}
		
		template.save(ad);
		
		return true;
	}
	
}
