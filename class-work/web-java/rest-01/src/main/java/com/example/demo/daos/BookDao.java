package com.example.demo.daos;

import java.util.List;

import com.example.demo.entities.Book;

public interface BookDao {
	
	List<Book> FindAll();
	List<Book> findBySubject(String subject);
	int save(Book b);
	Book findById(int id);
	int update(Book b);
	int updatePrice(int bookId, double newPrice);
	int deleteById(int bookId);

}
