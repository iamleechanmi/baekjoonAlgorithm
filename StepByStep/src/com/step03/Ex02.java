package com.step03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//A+B -3 
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		for (int i=0; i<number; i++){
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();

			System.out.println(number1 + number2);
		}
		sc.close();
	}
}
