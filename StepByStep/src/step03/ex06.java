package step03;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		//기찍 N
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();

		for(int i=number; i>0; i--){
			System.out.println(i);
		}
	}
}
