package com.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		//괄호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<String>();

		int cnt = Integer.parseInt(br.readLine());
		boolean flag = true;

		for (int i=0; i<cnt; i++) {
			String line = br.readLine();

			for (int j=0; j<line.length(); j++) {
				String bracket = line.substring(j, j+1);

				if (bracket.equals("(")) {
					stack.add(bracket);

				} else {
					if (stack.isEmpty()) {
						System.out.println("NO");
						flag = false;
						break;

					} else {
						stack.pop();
					}
				}
				
				if (flag == true && stack.isEmpty()) {
					System.out.println("YES");
					
				} else {
					if (flag == false) {
						
					} else {
						System.out.println("NO");
					}
				}
			}
			stack.clear();
		}
		br.close();
	}
}
