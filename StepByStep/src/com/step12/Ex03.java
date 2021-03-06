package com.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		//수 정렬하기3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		int[] number = new int[10000];
		
		for (int i=0; i<cnt; i++) {
			number[Integer.parseInt(br.readLine()) - 1]++;
		}
		
		for (int i=0; i<number.length; i++) {
			
			for (int j=0; j<number[i]; j++) {
				
				sb.append(i+1).append("\n");
			}
		}
		System.out.println(sb);
	}
}
