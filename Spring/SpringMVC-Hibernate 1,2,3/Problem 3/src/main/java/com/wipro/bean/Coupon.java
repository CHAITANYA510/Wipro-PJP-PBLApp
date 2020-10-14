package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coupon_table_1")
public class Coupon {

	@Id
	@Column(name="couponCode", length=16)
	private String couponCode;
	
	@Column(name="offerPercentage")
	private float offerPercentage;

	public Coupon() {
		
	}

	public Coupon(String couponCode, float offerPercentage) {
		
		this.couponCode = couponCode;
		this.offerPercentage = offerPercentage;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public float getOfferPercentage() {
		return offerPercentage;
	}

	public void setOfferPercentage(float offerPercentage) {
		this.offerPercentage = offerPercentage;
	}

	@Override
	public String toString() {
		return "Coupon [couponCode=" + couponCode + ", offerPercentage=" + offerPercentage + "]";
	}
	
	
}