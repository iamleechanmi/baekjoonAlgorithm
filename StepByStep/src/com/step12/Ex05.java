package com.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		//소트인사이드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String number = br.readLine();
		br.close();
		
		char[] tmp = new char[number.length()];
		for (int i=0; i<number.length(); i++) {
			tmp[i] = number.charAt(i);
		}
		Arrays.sort(tmp);
		
		for (int i=tmp.length-1; i>=0; i--) {
			sb.append(tmp[i]);
		}
		System.out.print(sb);
	}
}
