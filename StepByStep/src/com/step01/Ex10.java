package com.step01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		//나머지 
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		sc.close();

		System.out.println((number1+number2)%number3);
		System.out.println(((number1%number3) + (number2%number3))%number3);
		System.out.println((number1*number2)%number3);
		System.out.println(((number1%number3) * (number2%number3))%number3);
	}
}