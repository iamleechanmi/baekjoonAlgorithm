package com.step12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//좌표 정렬하기2
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[][] numbers = new int[cnt][2];
		
		for (int i=0; i<cnt; i++) {
			for (int j=0; j<2; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		Arrays.sort(numbers, (n1, n2) -> {
			if (n1[1] == n2[1]) {
				return n1[0] - n2[0];
			} else {
				return n1[1] - n2[1];
			}
		});
		
		for (int i=0; i<cnt; i++) {
			System.out.println(numbers[i][0] + " " + numbers[i][1]);
		}
	}
}
