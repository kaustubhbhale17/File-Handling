package com.file;

import java.io.*;

public class DocumentFormatter {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("Document.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("FormattedDocument.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		String line;
		while((line=br.readLine())!=null) {
			String sentence = line.trim().replaceAll("\\W+", " ");
			System.out.println(sentence);
			pw.write(sentence+"\n");
			
		}
		
		pw.close();
		br.close();
	}

}
