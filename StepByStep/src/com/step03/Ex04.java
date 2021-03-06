package com.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		//빠른 A+B 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(reader.readLine());

		for (int i=0; i<count; i++){
			String[] number = reader.readLine().split(" ");
			int sum = Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
			writer.write(sum + "\n");
		}

		reader.close();
		writer.flush();
		writer.close();
	}
}
