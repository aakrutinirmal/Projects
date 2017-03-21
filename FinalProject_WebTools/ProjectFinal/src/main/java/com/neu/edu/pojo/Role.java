package com.neu.edu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
@Table(name="roletable")
public class Role {

	@Id @GeneratedValue(generator="generator")
	@GenericGenerator(name="generator", strategy="foreign",
    parameters=@Parameter(name="property", value="userAccount"))
	@Column(name="userId")
	private long userId;

	@Column(name="role")
	private String role;
	
	@OneToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="userId")
	private UserAccount userAccount;

	public Role(){}
	
	public Role(String role) {
		this.role = role;
	}
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	
	
}
