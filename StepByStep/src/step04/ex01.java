package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex01 {

	public static void main(String[] args) {
		
		//A+B -5
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			while(true){
				String[] number = br.readLine().split(" ");

				if (number[0].equals("0") && number[1].equals("0")) {
					break;
				}

				int number1 = Integer.parseInt(number[0]);
				int number2 = Integer.parseInt(number[1]);

				bw.write(String.format("%d\n", number1 + number2));

			}

			br.close();
			bw.flush();
			bw.close();

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
