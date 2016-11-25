package com.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "training_master")
public class TrainingMasterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name="COURSE_ID")
	private String courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@Column(name="COURSE_DESC")
	private String courseDes;
	
	@Column(name="COURSE_TOWER")
	private int courseTower;
	
	@Column(name="COURSE_ROLE_ID")
	private int courseRoleId;
	
	@Column(name="COURSE_LVL")
	private int courseLevel;
	
	@Column(name="STATUS")
	private int status;
	
	@Column(name="COURSE_URL")
	private String courseURL;
	
	@Column(name="COURSE_TYPE")
	private String courseType;
	
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
	public String getCourseDes() {
		return courseDes;
	}
	public void setCourseDes(String courseDes) {
		this.courseDes = courseDes;
	}
	public int getCourseTower() {
		return courseTower;
	}
	public void setCourseTower(int courseTower) {
		this.courseTower = courseTower;
	}
	public int getCourseRoleId() {
		return courseRoleId;
	}
	public void setCourseRoleId(int courseRoleId) {
		this.courseRoleId = courseRoleId;
	}
	public int getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(int courseLevel) {
		this.courseLevel = courseLevel;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCourseURL() {
		return courseURL;
	}
	public void setCourseURL(String courseURL) {
		this.courseURL = courseURL;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
}
