package com.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		//수 정렬하기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<cnt; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		
		Collections.sort(list);
		
		for (int i=0; i<cnt; i++) {
			sb.append(list.get(i) + "\n");
		}
		System.out.println(sb);
	}
}
