package com.voya.training;

public class TwoDim {
	public static void main(String[] args) {
		int[][] marks = new int[3][2];

		System.out.println(marks.length);

		marks[0][0] = 50;
		marks[0][1] = 40;
		marks[1][0] = 80;
		marks[1][1] = 100;
		marks[2][0] = 20;
		marks[2][1] = 30;

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[j].length; j++) {
				System.out.print(marks[i][j]+" " );
			}
			System.out.println();
		}
		
		System.out.println("\nfor each loop");
		for(int [] one : marks)
		{
			for(int val : one)
			{
				System.out.println(val);
			}
		}
	}
}
