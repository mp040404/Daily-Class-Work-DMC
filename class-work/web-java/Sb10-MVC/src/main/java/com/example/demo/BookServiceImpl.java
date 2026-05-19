package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {
	@Autowired
	private BookDao bookDao;
	
	public List<Book> getBookbySubject(String subject){
		
		List<Book> list = bookDao.findBySubject(subject);
		return list;
		
	}

}
