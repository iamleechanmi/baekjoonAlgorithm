package com.step03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//N 찍기 
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		for (int i=1; i<=number; i++){
			System.out.println(i);
		}
	}
}
