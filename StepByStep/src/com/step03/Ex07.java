package com.step03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//A+B -7 
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i=1; i<=number; i++){

			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.printf("Case #%d: %d\n", i, number1 + number2);
		}
		sc.close();
	}
}