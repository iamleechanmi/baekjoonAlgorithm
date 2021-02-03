package com.step11;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//분해합
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int m = 0;
		
		for (int i=n-(String.valueOf(n).length()*9); i<n; i++) {
			int sum = i;
			int temp = i;
			
			while(temp > 0) {
				sum += temp % 10;
				temp = temp / 10;
			}
			
			if (sum == n) {
				m = i;
				break;
			}
		}
		System.out.println(m);
	}
}
