package com.file;

import java.io.*;

public class AddNumbers {

	public static void main(String[] args) {
		//reading single line from file numbes.txt
		BufferedReader br;
		double sum=0;
		
		try {
			br = new BufferedReader(new FileReader("numbers.txt"));
			String line;
			while((line=br.readLine())!=null) {
				sum=sum+Double.valueOf(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		
	}

}
