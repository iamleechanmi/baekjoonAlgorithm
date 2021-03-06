package com.step15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//동전 0
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ns = new int[n];
		
		int k = sc.nextInt();
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			ns[i] = sc.nextInt();
		}
		sc.close();
		
		//큰 동전부터
		for (int i=n-1; i>=0; i--) {
			cnt += k/ns[i];
			k = k%ns[i];
		}
		System.out.println(cnt);
	}
}
