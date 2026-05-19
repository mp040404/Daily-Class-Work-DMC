package com.example.demo;



import java.util.List;

public interface BookDao {
	
	List<Book> findAll();
	int save(Book b);

}
