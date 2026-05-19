package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sb03LifecycleApplication implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Sb03LifecycleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("----- Accessing beans from the container -----");
		Box b1 = ctx.getBean("b1",Box.class);
		System.out.println("Fetched b1 :" + b1.toString());
		System.out.println("Volume of b1 : "+b1.calculateVolume());
		
		
		Box b2 = ctx.getBean("b2", Box.class);
		System.out.println("Fetched b2 : "+ b2.toString());
		System.out.println("Volume of b2 : " + b2.calculateVolume());
		
	}

}
