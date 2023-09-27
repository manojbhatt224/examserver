package com.manoj.examserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userRoleid;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private User user;
	
	
	@ManyToOne
	private Role role;
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRole(Long userRoleid, User user, Role role) {
		super();
		this.userRoleid = userRoleid;
		this.user = user;
		this.role = role;
	}

	public UserRole(Long userRoleid, User user) {
		super();
		this.userRoleid = userRoleid;
		this.user = user;
	}

	public Long getUserRoleid() {
		return userRoleid;
	}

	public void setUserRoleid(Long userRoleid) {
		this.userRoleid = userRoleid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


}
