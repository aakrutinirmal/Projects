package com.neu.edu.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="studenttable")
@PrimaryKeyJoinColumn(name="userId")
public class Student extends UserAccount{

	public Student(){}
	
	@Column(name="marks")
	private String marks;
	
	
//	@Id @GeneratedValue
//	@OneToOne(fetch=FetchType.LAZY)
//	@PrimaryKeyJoinColumn(name="userId")
//    private long studentId;	
	
	
	public Student(String major,String ta_crn,String marks) {
	//	super(username, password,firstName, lastName, emailId);
		this.major=major;
		this.ta_crn=ta_crn;
		this.marks=marks;
	    this.crns = new HashSet<Course>();
	}
		
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="students")
	private Set<Course> crns=new HashSet<Course>();
	
	@Column(name="major")
	private String major;



	@Column(name="ta_crn")
	private String ta_crn;

	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	public String getTa_crn() {
		return ta_crn;
	}

	public void setTa_crn(String ta_crn) {
		this.ta_crn = ta_crn;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String string) {
		this.marks = string;
	}

	public Set<Course> getCrns() {
		return crns;
	}

	public void setCrns(Set<Course> crns) {
		this.crns = crns;
	}

	

	
	
	
	
}
