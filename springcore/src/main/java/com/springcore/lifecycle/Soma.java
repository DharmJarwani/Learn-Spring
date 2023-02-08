package com.springcore.lifecycle;

public class Soma {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("set price");
		this.price = price;
	}

	public Soma() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Soma [price=" + price + "]";
	}
	
	public void init(){
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	
}
