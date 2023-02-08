package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firststudent")

public class Student {
	
	private Sosa sosa;
	
	public Sosa getSosa() {
		return sosa;
	}

	public void setSosa(Sosa sosa) {
		this.sosa = sosa;
	}

	public Student(Sosa sosa) {
		super();
		this.sosa = sosa;
	}

	public void study()
	{
		this.sosa.display();
		System.out.println("student is reading book");
	}

}
