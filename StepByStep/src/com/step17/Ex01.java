package com.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		//스택
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int cnt = Integer.parseInt(br.readLine());
		
		for (int i=0; i<cnt; i++) {
			String[] command = br.readLine().split(" ");
			
			
			if (command[0].contains("push")) {
				stack.push(Integer.parseInt(command[1]));
				
			} else if (command[0].equals("pop")) {
				System.out.println(stack.isEmpty()? -1 : stack.pop());
			
			} else if (command[0].equals("size")) {
				System.out.println(stack.size());
			
			} else if (command[0].equals("empty")) {
				System.out.println(stack.isEmpty()? 1 : 0);
				
			} else if (command[0].equals("top")) {
				System.out.println(stack.isEmpty()? -1 : stack.peek());
			}
		}
		
		br.close();
	}
}
