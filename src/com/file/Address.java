package com.file;

import java.io.Serializable;

public class Address implements Serializable{
	private String line;
	private String city;
	
	public Address(String line, String city) {
		super();
		this.line = line;
		this.city = city;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
