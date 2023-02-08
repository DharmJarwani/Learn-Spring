package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Sosa getSosa()
	{
		return new Sosa();
	}
	
	
	@Bean
	public Student getStudent() {
		
		// Creating a new student object
		Student student = new Student(getSosa());
		
		return student;
	}

}
