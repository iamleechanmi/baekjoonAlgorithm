package com.step03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//구구단 
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		for (int i=1; i<=9; i++){
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}
}
