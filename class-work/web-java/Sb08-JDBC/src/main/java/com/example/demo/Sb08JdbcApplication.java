package com.example.demo;

import java.util.List;
import java.util.Scanner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb08JdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sb08JdbcApplication.class, args);
	}
	
	@Autowired
	private BookDao bookDao;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Book> list = bookDao.findAll();
		for (Book b : list) 
			System.out.println(b);
//		
//		System.out.print("Enter New Book Details\nEnter Id: ");
//		int bookId = sc.nextInt();
//		System.out.print("Enter Name: ");
//		String name = sc.next();
//		System.out.print("Enter Author: ");
//		String author = sc.next();
//		System.out.print("Enter Subject: ");
//		String subject = sc.next();
//		System.out.print("Enter Price: ");
//		double price = sc.nextDouble();
//		
//		Book b = new Book(bookId,name,author,subject,price);
//		int count = bookDao.save(b);
//		System.out.println("Books Saved : " + count);
		
	}
	
	

}
