package com.step07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		//문자열 반복
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for (int i=0; i<cnt; i++) {
			int repeat = sc.nextInt();
			String str = sc.next();
			
			for (int j=0; j<str.length(); j++) {
				
				for (int k=0; k<repeat; k++) {
					
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
