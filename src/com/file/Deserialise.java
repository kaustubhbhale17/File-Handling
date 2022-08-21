package com.file;

import java.io.*;

public class Deserialise {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("Cardetails.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		System.out.println(obj);
		
		ois.close();
	}
}
