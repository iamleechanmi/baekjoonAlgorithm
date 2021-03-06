package com.step05;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		//평균은 넘겠지
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();

		for (int i=0; i<caseNum; i++) {
			
			int studentNum = sc.nextInt();
			int[] score = new int[studentNum];
			
			int sum = 0;
			int avg = 0;
			int cnt = 0;

			for (int j=0; j<studentNum; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			avg = sum / studentNum;
			
			for (int j=0; j<studentNum; j++) {
				if (score[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (float)cnt / studentNum * 100);
		}
		sc.close();
	}
}
