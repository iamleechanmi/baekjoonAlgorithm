package step02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		//À±³â
		Scanner sc = new Scanner(System.in);

		int result = 0;
		int year = sc.nextInt();
		sc.close();

		if (year%4 == 0 && year%100 != 0){
			result = 1;

		} else if (year%400 == 0){
			result = 1;

		} else {
			result = 0;
		}

		System.out.println(result);
	}
}
