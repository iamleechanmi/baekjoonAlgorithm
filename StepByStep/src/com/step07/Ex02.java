package com.step07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//숫자의 합
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		String line = sc.nextLine();
		sc.close();
		for (int i=0; i<n; i++) {
			sum += ((int)line.charAt(i)-48);
		}
		System.out.println(sum);
	}
}
