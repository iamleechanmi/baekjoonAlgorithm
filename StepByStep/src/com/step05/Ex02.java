package com.step05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//최댓값 
		Scanner sc = new Scanner(System.in);
		int[] number = new int[9];
		number[0] = sc.nextInt();
		
		int line = 1;
		int max = number[0];
		
		for (int i=1; i<9; i++) {
			number[i] = sc.nextInt();
			
			if (number[i] > max) {
				max = number[i];
				line = i+1;
			}
		}
		System.out.printf("%d\n%d", max, line);
		sc.close();
	}
}
