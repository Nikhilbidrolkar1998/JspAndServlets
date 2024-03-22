package com.oops.basics;

public class Student {
	String department;
	String studentName;
	String usn;
	String city;
	
	public static void main(String[] args) {
		Student student=new Student();
		student.department="Infra";
		student.studentName="Nikhil";
		student.usn="2VX20Mc043";
		student.city="Dharwad";
		
		System.out.println("Student Name "+student.studentName);
		System.out.println("Student Department "+student.department);
		System.out.println("Student usn "+student.usn);
		System.out.println("Student City "+student.city);
	}
}
