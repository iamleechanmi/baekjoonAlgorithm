package com.step01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//사칙연산 
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		sc.close();

		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
	}
}
