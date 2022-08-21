package com.file;

import java.io.*;

public class Car implements Serializable{
	
	//private static final long serialVersionUID = 1L;
	private String registrationNo;
	private String carMake;
	private  transient Engine engine;
	
	public Car() {
		
	}
	public Car(String registrationNo, String carMake, Engine engine) {
		
		this.registrationNo = registrationNo;
		this.carMake = carMake;
		this.engine = engine;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
}
