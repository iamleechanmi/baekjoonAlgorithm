package com.step02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//알람 시계 
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		sc.close();

		int totalMinute = hour * 60 + minute - 45;

		if (totalMinute < 0){
			hour = 23;
			minute = totalMinute + 60;

		} else {
			hour = totalMinute/60;
			minute = totalMinute%60;
		}

		System.out.printf("%d %d", hour, minute);
	}
}
