package com.voya.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter City");
		String city=sc.next();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		
		System.out.println(name + " "+ age + " " +city+" "+ sal);
		
		sc.close();
	}

}
