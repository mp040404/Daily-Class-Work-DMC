package com.example.demo.Rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Book;

@Component
public class BookRowmapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new Book(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("author"),
					rs.getString("subject"),
					rs.getDouble("price"));
	}

}
