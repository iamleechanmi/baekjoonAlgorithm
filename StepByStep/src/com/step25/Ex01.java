package com.step25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		//두 수의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine()); //개수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] numbers = new int[cnt];
		
		for (int i=0; i<cnt; i++) {
			numbers[i] = Integer.parseInt(st.nextToken()); //배열에 저장
		}
		
		int x = Integer.parseInt(br.readLine()); //원하는 합
		Arrays.sort(numbers);
		
		int start = 0;
		int end = cnt-1;
		int result = 0;
		
		while (start < end) {
			int sum = numbers[start] + numbers[end];
			
			if (sum == x) {
				end--;
				start++;
				result++;
				
			} else if (sum > x) {
				end--;
				
			} else if (sum < x) {
				start++;
			}
		}
		
		System.out.println(result);
	}
}