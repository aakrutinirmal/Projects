package com.neu.edu.pojo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="useraccounttable")
@Inheritance(strategy=InheritanceType.JOINED)
public class UserAccount {
	
	@Id 
	@GeneratedValue
	@Column(name="userId")
	private long userId;

	
	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;
	
	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String lastName;
	
	@Column(name="emailId")
	private String emailId;

//	@OneToOne(fetch=FetchType.LAZY, mappedBy="userAccount", cascade=CascadeType.ALL)
	private String role;

	public UserAccount(){}
		
//	public UserAccount(String username, String password,String firstName,String lastName,String emailId) {
//		
//			
//        this.username = username;
//        this.password = password;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.emailId=emailId;
//    }
		
	
	public long getUserId() {
		return userId;
	}
	
	

	public void setUserId(long userId) {
		this.userId = userId;
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



	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}
