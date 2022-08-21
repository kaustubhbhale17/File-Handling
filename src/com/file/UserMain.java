package com.file;

import java.io.*;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(new FileWriter("UserDetails.txt"));
		
		System.out.println("Enter the number of users : ");
		int number = scanner.nextInt();
		
		System.out.println("Input User Details : ");
		
		for(int i=0;i<number;i++) {
			System.out.println("\nInput First Name : ");
			String fname = scanner.next();
			System.out.println("Input Last Name : ");
			String lname = scanner.next();
			System.out.println("Input email : ");
			String email = scanner.next();
			
			User u = new User(fname,lname,email);
			pw.write(u.getFirstName()+","+u.getLastName()+","+u.getEmail()+"\n");
		}
		
		pw.close();
		
		System.out.println("Check Output file !");
		System.out.println("\nDisplaying contents of file - ");
		
		BufferedReader br = new BufferedReader(new FileReader("UserDetails.txt"));

		String line ;
		System.out.println();
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		scanner.close();
	}

}
