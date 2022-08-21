package com.file;

import java.io.*;

public class Engine {
	
	private String engineNo;
	private int cubicCpacity;
	
	
	public Engine(String engineNo, int cubicCpacity) {
		
		this.engineNo = engineNo;
		this.cubicCpacity = cubicCpacity;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public int getCubicCpacity() {
		return cubicCpacity;
	}
	public void setCubicCpacity(int cubicCpacity) {
		this.cubicCpacity = cubicCpacity;
	}
	
	
}
