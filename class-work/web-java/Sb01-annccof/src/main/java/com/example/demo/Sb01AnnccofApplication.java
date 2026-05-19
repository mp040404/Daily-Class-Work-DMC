package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class Sb01AnnccofApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sb01AnnccofApplication.class, args);
	}
	@Autowired
	private ApplicationContext ctx;
	


	@Override
	public void run(String... args) throws Exception {
		
		Person p1 = (Person) ctx.getBean("p1");
		System.out.println("p1 --> " + p1);
		
//		Person p2 = (Person) ctx.getBean("p2");
//		System.out.println("p1 --> " + p2);
//		
		System.out.println("++++++++++++++++++++");
		
		Account a1 = (Account) ctx.getBean("a1");
		a1.deposit(1000);
		a1.withdraw(5000);
		System.out.println("A1 --> " + a1);
	}
	

}
