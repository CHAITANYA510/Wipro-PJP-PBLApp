package com.wipro.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="multi_car_owner")
public class MultiCarOwner {
	
	@Id
	@Column(name="ownerid", length = 5)
	private int ownerId;
	
	@Column(name="ownername", length = 10)
	private String ownerName;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="ownerid")  
	//@OrderColumn(name="cars")  
	private List<Car> car;

	public MultiCarOwner() {
		
	}

	public MultiCarOwner(int ownerId, String ownerName, List<Car> car) {
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

	public List<Car> getCar() {
		return car;
	}

	public void setCar(List<Car> car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "MultiCarOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", car=" + car.toString() + "]";
	}
	
	
	
}
