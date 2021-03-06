package com.step05;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//평균
		//자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
		//그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 
		//수학점수는 50/70*100이 되어 71.43점이 된다.
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] score = new int[cnt];
		int max = 0;

		//점수 입력과 동시에 최댓값을 찾는다.
		for (int i=0; i<cnt; i++) {
			score[i] = sc.nextInt();
			if (score[i] > max) {
				max = score[i];
			}
		}
		sc.close();
		
		float sum = 0;
		//조작한 평균 점수를 구한다.
		for (int i=0; i<cnt; i++) {
			sum += (float)score[i] / max * 100;
		}
		System.out.println(sum / cnt);
	}
}
