package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="students")

public class Student {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAdmissionerYear() {
		return admissionerYear;
	}
	public void setAdmissionerYear(String admissionerYear) {
		this.admissionerYear = admissionerYear;
	}
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String course;
	private String admissionerYear;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name,String course, String admissionerYear) {
		super();
		this.name=name;
		this.course = course;
		this.admissionerYear = admissionerYear;
	}

}
