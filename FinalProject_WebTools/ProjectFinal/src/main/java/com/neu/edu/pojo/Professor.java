package com.neu.edu.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="professortable")
@PrimaryKeyJoinColumn(name="userId")
public class Professor extends UserAccount {
	
	
 public Professor(){}
	
	public Professor(Set<Course> crns){
		this.crns=new HashSet<Course>();;
	}
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="professorId")
	private Set<Course> crns = new HashSet<Course>();

	
	
	public Set<Course> getCrns() {
		return crns;
	}

	public void setCrns(Set<Course> crns) {
		this.crns = crns;
	}
	
	 public void addCourse(Course course) {
		  getCrns().add(course);
	    }
//	public Professor(String username, String password,String firstName,String lastName,String emailId) {
//		super(username, password,firstName, lastName, emailId);
//		  this.crns = new HashSet<Course>();
//
//	}
	
	

}
