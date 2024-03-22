package com.voya.training;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String[] usernames = { "Nikhil", "Sandhya", "Megha", "Dadu", "Rani" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to Register");
		String uName = sc.next();
		boolean exist = false;
		for (String username : usernames) {
			if (uName.equals(username)) {
				System.out.println("Name is not unique");
				exist=true;
				break;
			}
		}
		if (!exist) 
	 	{
			System.out.println("you are registered");
		}

	}
}
