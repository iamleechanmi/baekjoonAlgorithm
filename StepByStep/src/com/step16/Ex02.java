package com.step16;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex02 {

	public static void main(String[] args) {
		
		//약수
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();

		for (int i=0; i<cnt; i++) {
			set.add(sc.nextInt());
		}
		
		sc.close();
		System.out.println(set.first() * set.last());
	}
}
