package com.file;

import java.io.*;
import java.util.Scanner;

public class ProvebCollection {
	
	public static void storeProveb(String proverb) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("TopProverbs.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int ch;
		for(int i=0;i<proverb.length();i++) {
			ch=proverb.charAt(i);
			bos.write(ch);
		}
		
		bos.close();
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String pro="",s="";
		System.out.println("Input ProVerbs");
		do {
			s = scanner.nextLine();
			if(s.contentEquals("STOP"))
				break;
			else {
				pro = pro+s+"\n";
			}
			
		}while(s!="STOP");
		
		ProvebCollection.storeProveb(pro);
		System.out.println("Check file ");
		scanner.close();
	}

}
