package com.step05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//최소, 최대 
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int[] number = new int[cnt];
		int min = sc.nextInt(), max = min;
		
		for (int i=1; i<cnt; i++) {
			number[i] = sc.nextInt();
			
			if (number[i] < min) {
				min = number[i];
			}
			
			if (number[i] > max) {
				max = number[i];
			}
		}
		sc.close();
		System.out.println(min + " " + max);
	}
}
