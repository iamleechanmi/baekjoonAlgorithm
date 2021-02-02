package com.step06;

//정수 N개의 합
public class Ex01 {
    long sum(int[] a) {
        long ans = 0;
        
        for (int i=0; i<a.length; i++) {
        	ans += a[i];
        }
        return ans;
    }
}

