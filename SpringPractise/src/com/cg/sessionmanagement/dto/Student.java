package com.cg.sessionmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="studentvenky")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	
	@Column(name="StudentName")
	@NotEmpty(message="Name should be given")
	private String studentName;
	
	@Column(name="Department")
	@NotEmpty(message="Department is Important")
	private String studentDepartment;
	
	
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDepartment() {
		return studentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	

}
