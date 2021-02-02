package com.step11;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//블랙잭
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] cards = new int[n];
		
		for (int i=0; i<n; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println(sum(cards, n, m));
	}

	private static int sum(int[] cards, int n, int m) {
		int max = 0;
		
		for (int i=0; i<n-2; i++) {
			
			for (int j=i+1; j<n-1; j++) {
				
				for (int k=j+1; k<n; k++) {
					
					int sum = cards[i] + cards[j] + cards[k];
					
					if (sum < m && max <= sum) {
						max = sum;
						
					} if (sum == m) {
						return sum;
					}
				}
			}
		}
		
		return max;
	}
}
