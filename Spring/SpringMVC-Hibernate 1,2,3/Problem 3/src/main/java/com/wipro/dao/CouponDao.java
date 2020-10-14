package com.wipro.dao;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Coupon;

@Repository
@Transactional
public class CouponDao {

	@Autowired
	SessionFactory sf;
	
	@Autowired
	HibernateTemplate template;
	
	public boolean validCode(Coupon coup) {
		
		Coupon coupon = (Coupon) template.get(Coupon.class, coup.getCouponCode());
		if(coupon!=null) {
			return true;
		}
		return false;
	}

	public float getDiscountPercentage(Coupon coup) {

		Coupon coupon = (Coupon) template.get(Coupon.class, coup.getCouponCode());
		return coupon.getOfferPercentage();
	}
	
}
