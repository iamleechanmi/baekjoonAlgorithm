package com.step16;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//최소공배수
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int gcd = 0;
		int lcm = 0;
		
		for (int i=0; i<cnt; i++) {
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			
			gcd = getGcd(number1, number2);
			lcm = (number1 / gcd) * (number2 / gcd) * gcd;
			System.out.println(lcm);
		}
		sc.close();
	}

	private static int getGcd(int number1, int number2) {
		int tmp = 0;
		
		if (number1 < number2) {
			tmp = number1;
			number1 = number2;
			number2 = tmp;
		}
		
		while (number2 != 0) {
			tmp = number1 % number2;
			number1 = number2;
			number2 = tmp;
		}
		
		return number1;
	}
}
