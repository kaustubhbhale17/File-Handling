package com.file;

import java.io.*;

public class ProverbReader {
	public static void main(String[] args) throws Exception{
		
		FileInputStream file = new FileInputStream("TopProverbs.txt");

        BufferedInputStream input = new BufferedInputStream(file);

        int i = input .read();

        while (i != -1) {
            System.out.print((char) i);
            i = input.read();
        }
        input.close();
		
		
	}

}
