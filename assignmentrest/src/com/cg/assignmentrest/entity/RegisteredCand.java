package com.cg.assignmentrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RegisteredCand {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int courseId;
	private String course;
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public RegisteredCand(int id, String course) {
		super();
		this.id = id;
		this.course = course;
	}
	public RegisteredCand() {
		super();
	}
	
}
