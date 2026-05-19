package com.example.demo;




import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class BookRowMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String author = rs.getString("author");
		String subject = rs.getString("subject");
		double price = rs.getDouble("price");
		return new Book(id,name,author,subject,price);
	}
	

	
	
}
