package com.step02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//두 수 비교하기 
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		sc.close();

		if (number1 > number2){
			System.out.println(">");
			
		} else if (number1 < number2){
			System.out.println("<");
			
		} else if (number1 == number2){
			System.out.println("==");
		}
	}
}
