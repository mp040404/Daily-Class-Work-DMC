package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sb01StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sb01StudentApplication.class, args);
	}
	 @Autowired
	private ApplicationContext ctx;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = (Student) ctx.getBean("s1");
		System.out.println("s1 ---> "+ s1);
		
		System.out.println("============================");
		
		Addmission a1 = (Addmission) ctx.getBean("a1");
		System.out.println("a1 ---> "+a1);
		
		
	}

}
