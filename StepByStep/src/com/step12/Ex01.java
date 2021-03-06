package com.step12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//수 정렬하기(Bubble sort)
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] number = new int[cnt];
		
		for (int i=0; i<cnt; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		
//		Arrays.sort(number);
		for (int i=cnt-1; i>0; i--) {
			
			for (int j=0; j<i; j++) {
				
				if (number[j] > number[j+1]) {
					
					int tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}
		
		for (int sort : number) {
			System.out.println(sort);
		}
	}
}
