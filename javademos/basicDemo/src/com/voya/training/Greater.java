package com.voya.training;

public class Greater {
	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int z = 30;
		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > z ) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}
	}
}
