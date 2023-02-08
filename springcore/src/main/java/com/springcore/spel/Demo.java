package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+5+56+34}")
	private int y;
	
	// This is the way to call static method
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	
	// This is the way to call static variable
	@Value("#{T(java.lang.Math).E}")
	private double E;
	
	// This is the way to create object with expresstion
	@Value("#{ new java.lang.String('Durgesh Tiwari')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	public double getE() {
		return E;
	}
	public void setE(double e) {
		E = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
	

}
