package com.step07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//상수
		Scanner sc = new Scanner(System.in);
		
		int tmp1 = sc.nextInt();
		int tmp2 = sc.nextInt();
		sc.close();
		
		int number1 = (tmp1 / 100) + (tmp1 % 100) / 10 * 10 + (tmp1 % 10) * 100;
		int number2 = (tmp2 / 100) + (tmp2 % 100) / 10 * 10 + (tmp2 % 10) * 100;
		
		System.out.println(number1 > number2 ? number1 : number2);
	}
}
