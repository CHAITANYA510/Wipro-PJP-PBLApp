package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="car_owner")
public class CarOwner {
	
	@Id
	@Column(name="ownerid", length = 5)
	private int ownerId;
	
	@Column(name="ownername", length = 10)
	private String ownerName;
	
	@OneToOne
	private Car car;

	public CarOwner() {
		
	}

	public CarOwner(int ownerId, String ownerName, Car car) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.car = car;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", car=" + car.toString() + "]";
	}
	
	
	
}
