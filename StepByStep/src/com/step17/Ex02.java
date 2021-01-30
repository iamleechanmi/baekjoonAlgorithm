package com.step17;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		
		//제로
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int result = 0;
		
		Stack<Integer> numbers = new Stack<Integer>();
		
		for (int i=0; i<cnt; i++) {
			int number = sc.nextInt();
			
			if (number == 0) {
				numbers.pop();
			} else {
				numbers.push(number);
			}
		}
		sc.close();
		
		for (int n : numbers) {
			result += n;
		}
		
		System.out.println(result);
	}
}
