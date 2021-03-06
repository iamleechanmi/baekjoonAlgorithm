package com.step07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		//단어 공부
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		sc.close();

		int[] alpha = new int[26];
		int max = 0;
		char result = '?';
		
		//A(65) Z(90)
		for (int i=0; i<str.length(); i++) {
			alpha[str.charAt(i)-65]++;
			
			if (alpha[str.charAt(i)-65] > max) {
				max = alpha[str.charAt(i)-65];
				result = str.charAt(i);
				
			} else if (alpha[str.charAt(i)-65] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}
