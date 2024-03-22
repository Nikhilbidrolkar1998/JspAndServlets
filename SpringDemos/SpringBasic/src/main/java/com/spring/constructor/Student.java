package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	private String StudName;
	private String department;
	private Course course;
	
	public Student(Course course) {
		super();
		this.course = course;
	}
	public String getStudName() {
		return StudName;
	}
	@Value("${student.name}")
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [StudName=" + StudName + ", department=" + department + ", course=" + course + "]";
	}
	
}