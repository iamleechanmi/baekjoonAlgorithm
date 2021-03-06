package com.step12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//좌표 정렬하기
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[][] number = new int[cnt][2];
		
		for (int i=0; i<cnt; i++) {
			for (int j=0; j<2; j++) {
				number[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		//람다식 활용
		Arrays.sort(number, (n1, n2) -> {
			if (n1[0] == n2[0]) {
				return n1[1] - n2[1];
			} else {
				return n1[0] - n2[0];
			}
		});
		
		for (int i=0; i<cnt; i++) {
			System.out.print(number[i][0]);
			System.out.println(" " + number[i][1]);
		}
	}
}
