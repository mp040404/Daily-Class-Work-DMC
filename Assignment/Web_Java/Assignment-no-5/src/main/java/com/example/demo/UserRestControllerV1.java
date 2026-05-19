package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class UserRestControllerV1 {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/user")
	public List<User> getAllUser(){
		List<User> list = userDao.findAll();
		return list;
		
	}
	
	@GetMapping("/user/{email}")
	public User getFindbyEmail(@PathVariable("email") String email){
		
		User user = userDao.findByEmail(email);
		if(user == null)
			return null;
		return user;
		
	}
	
//	int save(User u);
//	int update(User u);
//	int updatePass(int Userid,String password);
//	int deleteById(int UserId);
	@PostMapping("/user")
	public int addUser(@RequestBody User u) {
		try {
			int cnt = userDao.save(u);
			return cnt;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@PutMapping("/user/{id}")
	public int updateUserPassword(@PathVariable("id") int userId, @RequestBody User u) {
	    System.out.println("PUT API HIT");
	    int cnt = userDao.updatePass(userId, u.getPassword());
	    return cnt;
	}
	

}
