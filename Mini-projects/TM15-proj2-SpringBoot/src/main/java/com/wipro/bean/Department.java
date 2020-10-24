package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptno;
	@Column(length=10)
	private String dname;
	@Column(length=10)
	private String loc;
	@Column
	private double budget;
	
	public Department() {
		
	}

	public Department(int deptno, String dname, String loc, double budget) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.budget = budget;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", budget=" + budget + "]";
	}
	
}
