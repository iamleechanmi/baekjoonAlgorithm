package com.step01;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		//곱셈 
        Scanner sc = new Scanner(System.in);
        
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        
        int one, ten, hundred = 0;
        
        System.out.println(one = number1 * (number2%10));
        System.out.println(ten = number1 * (number2%100/10));
        System.out.println(hundred = number1 * (number2/100));
        System.out.println(one + ten * 10 + hundred * 100);
	}
}
