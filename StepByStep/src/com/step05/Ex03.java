package com.step05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//숫자의 개수 
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];
		int multiple = 1;
		
		for (int i=0; i<3; i++) {
			number[i] = sc.nextInt();
			multiple = multiple * number[i];
		}
		sc.close();
		
		int[] result = new int[10];

		String temp = "" + multiple;
		
		for (int i=0; i<temp.length(); i++) {
			
			for (int j=0; j<=9; j++) {
				
				if (j == temp.charAt(i) - 48) {
					result[j]++;
				}
			}
		}

		for (int i=0; i<=9; i++) {
			System.out.println(result[i]);
		}
	}
}
