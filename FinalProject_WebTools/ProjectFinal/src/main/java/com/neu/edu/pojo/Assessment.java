package com.neu.edu.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="assessmenttable")
public class Assessment {

	@Id @GeneratedValue
	@Column(name="assessmentId")
	private int assessmentId;
	
	@Column(name="assessmentName")
	private String assessmentName;
	
	@Column(name="assessmentDesc")
	private String assessmentDesc;
	
	@Column(name="creationDate")
	private Date creationDate;
	
	@Column(name="completionDate")
	private Date completionDate;
	
	@PrimaryKeyJoinColumn(name="crn")
	private int crn;

	
	public Assessment(){}
	public int getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getAssessmentName() {
		return assessmentName;
	}

	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}

	public String getAssessmentDesc() {
		return assessmentDesc;
	}

	public void setAssessmentDesc(String assessmentDesc) {
		this.assessmentDesc = assessmentDesc;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public int getCrn() {
		return crn;
	}

	public void setCrn(int crn) {
		this.crn = crn;
	}
	
	
	
}
