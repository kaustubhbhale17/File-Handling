package com.file;

import java.io.*;

public class ProverbReverser {
	
	public static String reverseWord(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception{
		//Reading contents from topProverbs.txt
		FileReader fr = new FileReader("TopProverbs.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("ReverseProverb.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		String line,mainString="";
		
		while((line=br.readLine())!=null) {
			String sentence = line.trim().replaceAll("\\W+", " ");
			String[] words = sentence.split(" ");
			for(int i=0;i<words.length;i++) {
				String reverseW = reverseWord(words[i]);
				mainString+=reverseW+" ";
			}
			pw.write(mainString+"\n");
		}
		
		System.out.println("Check File ! ");
		br.close();
		pw.close();
		
	}

}
