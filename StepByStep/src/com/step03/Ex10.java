package com.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10 {

	public static void main(String[] args) {

		//별 찍기 -2 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int count = Integer.parseInt(br.readLine());
			String blank = " ";
			String star = "*";

			for (int i=1; i<=count; i++){

				for (int j=0; j<count-i; j++){
					bw.write(blank);
				}
				for (int k=0; k<i; k++){
					bw.write(star);
				}
				bw.write("\n");
			}

			br.close();
			bw.flush();
			bw.close();

		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
