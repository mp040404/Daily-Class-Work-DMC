package com.example.demo.Rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.entities.User;

@Component
public class UserRowMapping implements RowMapper<User>  {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		String sql = "Select * from users";
		return new User(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getString("password"),
				rs.getString("email"),
				rs.getDate("birth"),
				rs.getString("addr"),
				rs.getInt("role"));
	}

}
