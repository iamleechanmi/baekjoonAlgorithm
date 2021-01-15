package step02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		//사분면 고르기
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();
		
		int result = 0;

		if (x > 0){

			if (y > 0){
				result = 1;
			} else if (y < 0){
				result = 4;
			}
		} else if (x < 0){

			if (y > 0){
				result = 2;
			} else if (y < 0){
				result = 3;
			}
		}

		System.out.println(result);
	}
}
