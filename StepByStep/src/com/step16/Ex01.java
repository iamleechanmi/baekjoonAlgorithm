package com.step16;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//배수와 약수
		Scanner sc = new Scanner(System.in);
		while (true) {
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();

			if (number1 == 0 && number2 == 0) {
				sc.close();
				break;
			} 
			
			if (number1 % number2 == 0) {
				System.out.println("multiple");
				
			} else if (number2 % number1 == 0) {
				System.out.println("factor");
				
			} else {
				System.out.println("neither");
			}
			
		} //while문
	}
}
