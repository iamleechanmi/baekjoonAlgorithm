package com.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		//A+B -4 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " ");

			int number1 = Integer.parseInt(st.nextToken());
			int number2 = Integer.parseInt(st.nextToken());
			
			System.out.println(number1 + number2);
		}

		br.close();
	}
}
