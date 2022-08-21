package com.file;

import java.io.*;

public class TestClient {
	
	public static void main(String[] args) throws Exception{
		String fileName="employeedetails.ser";
		
		serialiseObject(fileName);
		deserialise(fileName);
	}

	private static void deserialise(String fileName) {
		//reading from file
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e = (Employee)ois.readObject();
			System.out.println(e.getName()+" "+e.getAge()+" "+e.getAddress()+" "+e.getAddress());
			
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void serialiseObject(String fileName) {
		//writing in file;
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Address address = new Address("Line 1","Pune");
			Employee e = new Employee("Suresh",40,address);
			oos.writeObject(e);
			
			oos.close();
			System.out.println("Written");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
