package com.neu.edu.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="teachtable")
public class Teach {

	@Id @GeneratedValue
	@Column(name="crn")
	private int crn;
	
	@PrimaryKeyJoinColumn(name="userId")
	private int userId;
	
	@Column(name="role")
	private String role;
	
	@Column(name="section")
	private String section;
	
	@Column(name="courseName")
	private String courseName;

	public Teach(){}
	
	public int getCrn() {
		return crn;
	}

	public void setCrn(int crn) {
		this.crn = crn;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
