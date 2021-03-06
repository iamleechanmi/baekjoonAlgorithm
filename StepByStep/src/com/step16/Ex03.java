package com.step16;

import java.util.Scanner;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		
		//최대공약수와 최소공배수
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		sc.close();

		Stack<Integer> st = new Stack<Integer>();
		
		for (int i=1; i<=number2; i++) {
		
			if (number1 % i == 0 && number2 % i == 0) {
				st.push(i);
			}
		}
		
		int max = st.pop();
		int tmp1 = number1 / max;
		int tmp2 = number2 / max;
		
		System.out.println(max);
		System.out.println(max * tmp1 * tmp2);
	}
}
