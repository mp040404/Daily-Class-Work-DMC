package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRowMapping userRowMapping;

	@Override
	public List<User> findAll() {
		String sql = "Select * from Users";
		return jdbcTemplate.query(sql, userRowMapping);
	}

	@Override
	public User findByEmail(String email) {
		String sql = "SELECT * FROM users WHERE email=?";
		List<User> list = jdbcTemplate.query(sql, userRowMapping, email);
		return list.size() == 0 ? null : list.get(0);
	}

	@Override
	public int save(User u) {
		  String sql = "INSERT INTO users(name, password, email, birth, addr, role) VALUES (?, ?, ?, ?, ?, ?)";

		    int cnt = jdbcTemplate.update(sql,
		            u.getName(),
		            u.getPassword(),
		            u.getEmail(),
		            u.getBirth(),   
		            u.getAddr(),
		            u.getRole());

		    return cnt;
	}

	@Override
	public int update(User u) {
		String sql = "Update Users set name=?,password=?,email=?,birth=?,addr=?,role=0) where id = ?";
		int cnt = jdbcTemplate.update(sql,u.getName(),u.getPassword(),u.getEmail(),u.getBirth(),u.getId());
		return cnt;
	}

	
	@Override
	public int deleteById(int UserId) {
		String sql = "Delete from users where id = ?";
		int cnt = jdbcTemplate.update(sql,UserId);
		return cnt;
	}

	@Override
	public int updatePass(int Userid, String password) {
	    String sql = "UPDATE users SET password=? WHERE id=?";
	    
	    int cnt = jdbcTemplate.update(sql, password, Userid);
	    
	    System.out.println("Updated rows: " + cnt); // 👈 add this
	    
	    return cnt;
	}
	
}
