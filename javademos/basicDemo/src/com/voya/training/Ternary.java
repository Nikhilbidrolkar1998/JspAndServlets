package com.voya.training;

public class Ternary {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int greater = a>b && a>c ? a: b>c ? b:c;
		
		System.out.println("greater num is "+greater);
		
	}
}
