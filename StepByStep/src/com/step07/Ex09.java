package com.step07;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//크로아티아 알파벳
		Scanner sc = new Scanner(System.in);
		String input = sc.next().replaceAll("c=|c-|d-|dz=|lj|nj|s=|z=", "0");
		sc.close();
		
		System.out.println(input.length());
	}
}
