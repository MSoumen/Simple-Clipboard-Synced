package com.soumen.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //marks this class for JPA entity/table/relation
@Table(name="T_student")
public class Student {
	@Id
	private String studentID;
	
	@Column(name="sroll") //for mapping with DB column and JPA attribute
	private Integer roll;
	
	
	@Column(name="sname")
	private String name;
	
	@Column(name="sdept")
	private String dept;
	
	@CreationTimestamp
	private Date createdAt;

	@CreationTimestamp
	private Date modifiedAt;

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	
}
