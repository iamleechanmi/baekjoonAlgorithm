package com.step01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		//A/B 
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		sc.close();

		System.out.println((double)number1 / number2);
	}
}