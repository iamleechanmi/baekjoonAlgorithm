package com.step03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		//X보다 작은 수 
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int maxNumber = sc.nextInt();

		for (int i=0; i<count; i++) {
			int number = sc.nextInt();

			if (number < maxNumber) {
				System.out.print(number + " ");
			}
		}
		sc.close();
	}
}