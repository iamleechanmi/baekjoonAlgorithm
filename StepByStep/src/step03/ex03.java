package step03;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		//합
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.close();
		
		int sum = 0;

		for (int i=1; i<=number; i++){
			sum += i;    
		}

		System.out.println(sum);
	}
}
