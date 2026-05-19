package com.example.demo.Dao;

import java.util.List;

import com.example.demo.entities.Book;

public interface BookDao {
	
	List<Book> FindAll();
	List<Book> findBySubject(String subject);

}
