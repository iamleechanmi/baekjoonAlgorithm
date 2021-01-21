package com.step05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		//OX퀴즈
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] line = new String[n];
		
		for (int i=0; i<n; i++) {
			int score = 0;	
			int tmp = 0;

			line[i] = sc.nextLine();

			for (int j=0; j<line[i].length(); j++) {

				char result = line[i].charAt(j);

				if (result == 'O') {
					tmp++;
				} else {
					tmp = 0;
				}
				score += tmp;
			}
			System.out.println(score);
		}
		sc.close();
		
	}

}
