package com.step11;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int end = 666;
		int cnt = 1;
		
		while (cnt != n) {
			end += 1;
			
			if (String.valueOf(end).contains("666")) {
				cnt++;
			}
		}
		System.out.println(end);
	}
}