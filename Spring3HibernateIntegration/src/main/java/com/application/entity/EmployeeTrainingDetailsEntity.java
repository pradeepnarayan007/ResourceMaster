package com.application.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training_details")
public class EmployeeTrainingDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="COURSE_ID")
	private String courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_START_DATE")
	private Timestamp courseStartDate;
	
	@Column(name="COURSE_COMPLETED_DATE")
	private Timestamp courseCompletedDate;
	
	@Column(name="COURSE_LINK")
	private String courseLink;
	
	@Column(name="EMP_ID")
	private int empId;
	
	public EmployeeTrainingDetailsEntity() {
	
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Timestamp getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(Timestamp courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public Timestamp getCourseCompletedDate() {
		return courseCompletedDate;
	}
	public void setCourseCompletedDate(Timestamp courseCompletedDate) {
		this.courseCompletedDate = courseCompletedDate;
	}
	public String getCourseLink() {
		return courseLink;
	}
	public void setCourseLink(String courseLink) {
		this.courseLink = courseLink;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
