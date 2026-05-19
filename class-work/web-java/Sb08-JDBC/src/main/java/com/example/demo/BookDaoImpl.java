package com.example.demo;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BookRowMapper bookRowMapper;
	@Override
	public List<Book> findAll() {
		String sql = "SELECT * FROM books";
		List<Book> list = jdbcTemplate.query(sql, bookRowMapper);
		return list;
	}
	@Override
	public int save(Book b) {
		String sql = "INSERT INTO books (id, name, author, subject, price) VALUES (?, ?, ?, ?, ?)";
		int cnt = jdbcTemplate.update(sql, b.getId(), b.getName(), b.getAuthor(), b.getSubject(), b.getPrice());
		return cnt;
	}

	
	

	

}
