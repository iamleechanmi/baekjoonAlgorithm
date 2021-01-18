package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex09 {

	public static void main(String[] args) {
		
		//별 찍기 -1
		try{

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

			int count = Integer.parseInt(reader.readLine());
			String star = "*";

			for(int i=1; i<=count; i++){

				for (int j=0; j<i; j++){
					writer.write(star);
				}
				writer.write("\n");
			}

			reader.close();
			writer.flush();
			writer.close();

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
