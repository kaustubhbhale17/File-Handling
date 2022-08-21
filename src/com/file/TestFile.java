package com.file;

import java.io.*;

public class TestFile {

	public static void main(String[] args) {
		File file;
		file = new File("D:\\Badminton");
		file.mkdir();
		
		String path = (file.getAbsolutePath());
		System.out.println(path);
		try {
			File singles = new File("D:\\Badminton\\singles.txt");
			if(singles.createNewFile())
				System.out.println("File created");
			File dubbles = new File("D:\\Badminton\\dubbles.txt");
			if(dubbles.createNewFile())
				System.out.println("File created ");
		}catch(IOException e) {
			System.out.println("File already exists");
		}
		file = new File("D:\\Badminton\\Courts");
		file.mkdir();
		file = new File("D:\\Badminton\\Courts\\smash.dat");
		try {
			file.createNewFile();
		}catch(IOException e) {
			System.out.println(file.getName()+" already exists");
		}
		file= new File("D:\\Badminton\\Dubbles.txt");
		File rename = new File("D:\\Badminton\\Double.txt");
		if(file.renameTo(rename)) {
			System.out.println("Renamed Successfully ! ");
		}
		else {
			System.out.println("Failed");
		}
		file= new File("D:\\Badminton\\singles.txt");
		if(file.delete()) {
			System.out.println("Deleted");
		}else {
			System.out.println("Failed");
		}
	}

}
