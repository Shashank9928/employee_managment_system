package com.capgemini.employee_management_system.controller.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {
	@Id
	private String userId;
	private String password;
	private String role;
	private int result;
	
	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public User(String userId, String password, String role, int result) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.result = result;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + ", result=" + result + "]";
	}
	
	
}
