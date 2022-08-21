package com.file;

import java.io.*;

public class SerializeCar {

	public static void main(String[] args) throws Exception{
		//serialise car
		
		BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("Cardetails.dat"));
		ObjectOutputStream oos = new ObjectOutputStream(bis);
		
		Car[] cars = {
				new Car("MH20 4500","Paras Motors",new Engine("ENG101",400)),
				new Car("MH20 4400","Sagar Motors",new Engine("ENG102",400)),
				new Car("MH20 4700","Hyundai Motors",new Engine("ENG103",600))
		};

		for(Car car: cars) {
			oos.writeObject(car);
		}
		System.out.println("End");
		oos.close();
		bis.close();
		
		FileInputStream fis = new FileInputStream("Cardetails.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car obj = (Car)ois.readObject();
		
		System.out.println(obj.getRegistrationNo()+" "+obj.getCarMake()+","+obj.getEngine());
		
		ois.close();
		
	}

}
