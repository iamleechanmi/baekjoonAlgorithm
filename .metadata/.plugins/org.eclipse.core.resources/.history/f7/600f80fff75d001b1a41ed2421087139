package com.step07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//상수
		Scanner sc = new Scanner(System.in);
		String tmp1 = sc.next();
		String tmp2 = sc.next();
		sc.close();
		
		int number1 = change(tmp1);
		int number2 = change(tmp2);
		
		System.out.println(number1 > number2 ? number1 : number2);
		
	}

	private static int change(String tmp) {
		
		int hundreds = Integer.parseInt(tmp.substring(2));
		int tens = Integer.parseInt(tmp.substring(1,2));
		int units = Integer.parseInt(tmp.substring(0,1));
		
		return hundreds * 100 + tens * 10 + units;
	}
}
