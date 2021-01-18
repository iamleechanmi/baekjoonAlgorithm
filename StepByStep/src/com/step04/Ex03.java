package com.step04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		//더하기 사이클 
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		sc.close();
		int first = number/10;
		int second = number%10;
		int temp = (second*10) + (first+second)%10;
		int cnt = 1;

		while (number != temp) {
			cnt++;
			first = temp/10;
			second = temp%10;
			temp = (second*10) + (first+second)%10;			
		}
		System.out.println(cnt);
	}
}
