package com.step07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(line, " ");
		
		System.out.println(st.countTokens());
	}
}
