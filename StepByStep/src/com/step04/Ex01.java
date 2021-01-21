package com.step04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) {
		
		//A+B -5 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while(true){
				String[] number = br.readLine().split(" ");

				if (number[0].equals("0") && number[1].equals("0")) {
					break;
				}

				int number1 = Integer.parseInt(number[0]);
				int number2 = Integer.parseInt(number[1]);

				System.out.println(number1 + number2);

			}

			br.close();

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}