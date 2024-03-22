package com.oops.basics;

public class Employee {
	String employeeName;
	int employeeId;
	double salary;
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.employeeName="Teena";
		employee.employeeId=12;
		employee.salary=2000;
		System.out.println("Name "+employee.employeeName);
		System.out.println("Id "+employee.employeeId);
		System.out.println("Salary "+employee.salary);
		
		Employee employee1=new Employee();
		employee1.employeeName="Raju";
		employee1.employeeId=22;
		employee1.salary=3000;
		System.out.println("Name "+employee1.employeeName);
		System.out.println("Id "+employee1.employeeId);
		System.out.println("Salary "+employee1.salary);
	}
}
