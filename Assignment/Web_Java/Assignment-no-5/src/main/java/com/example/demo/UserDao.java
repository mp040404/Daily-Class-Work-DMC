package com.example.demo;

import java.util.List;


public interface UserDao {
	
	List<User> findAll();
	User findByEmail(String email);
	int save(User u);
	int update(User u);
	int updatePass(int Userid,String password);
	int deleteById(int UserId);
}
