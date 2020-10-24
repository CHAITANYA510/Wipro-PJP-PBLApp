package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table_1")
public class Admin {

	@Id
	@Column(name="username", length=10)
	private String username;
	
	@Column(name="password", length=6)
	private String password;
	
	@Column(name="empno", length=5)
	private String empno;
	
	@Column(name="email", length=20)
	private String email;

	public Admin() {
		
	}

	public Admin(String username, String password, String empno, String email) {
		super();
		this.username = username;
		this.password = password;
		this.empno = empno;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", empno=" + empno + ", email=" + email + "]";
	}

}
