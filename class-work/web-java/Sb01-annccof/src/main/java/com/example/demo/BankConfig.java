package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class BankConfig {
	
	@Bean
	Person p3(){
		//Constructor Based 
		Person p = new PersonImpl("Mohit",50);
		return p;
	}
	
	
	
	@Bean 
	Account a5() {
		Account a = new AccountImpl(101,"Saving",50000,p3());
		return a;
	}
	
	
	

}
