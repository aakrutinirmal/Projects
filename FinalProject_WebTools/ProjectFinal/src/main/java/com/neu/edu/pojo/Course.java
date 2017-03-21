package com.neu.edu.pojo;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coursetable")
public class Course {

	@Id @GeneratedValue
	@Column(name="crn")
	private long crn;
	
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Student students ;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="courseDescription")
	private String courseDescription;
	
	@Column(name="creditHour")
	private int creditHour;
	
	@ManyToOne
	 @JoinColumn
	 private Professor professorId;
	
	
	public Course(){}
	
//	public Course(String courseName,String courseDesc,int credithr ){
//		this.courseName=courseName;
//		this.courseDescription=courseDesc;
//		this.creditHour=credithr;
//		this.students = new HashSet<UserAccount>();
//		
//	}


	public long getCrn() {
		return crn;
	}

	public void setCrn(long crn) {
		this.crn = crn;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCreditHour() {
		return creditHour;
	}

	public void setCreditHour(int creditHour) {
		this.creditHour = creditHour;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Professor getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Professor professorId) {
		this.professorId = professorId;
	}

	

	
	
	
}
