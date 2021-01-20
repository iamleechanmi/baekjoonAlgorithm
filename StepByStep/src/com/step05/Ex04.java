package com.step05;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//나머지
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];

		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			nums[i] = sc.nextInt() % 42;
			set.add(nums[i]);
		}
		sc.close();

		System.out.println(set.size());
	}
}
