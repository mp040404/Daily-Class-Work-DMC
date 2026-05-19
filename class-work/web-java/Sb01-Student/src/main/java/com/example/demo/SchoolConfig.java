package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

	@Bean
	Student s1() {
		Student s = new StudentImpl("mohit",932541252);
		return s;
		
	}
	
	@Bean
	Addmission a1() {
		Addmission a = new AddmissionImpl(101,2,s1());
		return a;
	}
}
