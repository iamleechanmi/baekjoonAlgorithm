package com.step17;

import java.util.Scanner;
import java.util.Stack;

public class Ex01 {

	public static void main(String[] args) {
		
		//스택
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int cnt = sc.nextInt();
		
		for (int i=0; i<cnt; i++) {
			String command = sc.next();
			
			if (command.contains("push")) {
				stack.push(sc.nextInt());
				
			} else if (command.equals("pop")) {
				System.out.println(stack.isEmpty()? -1 : stack.pop());
			
			} else if (command.equals("size")) {
				System.out.println(stack.size());
			
			} else if (command.equals("empty")) {
				System.out.println(stack.isEmpty()? 1 : 0);
				
			} else if (command.equals("top")) {
				System.out.println(stack.isEmpty()? -1 : stack.peek());
			}
		}
		sc.close();
	}
}
