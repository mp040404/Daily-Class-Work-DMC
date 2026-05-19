package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/login")
	public String authonticationUser(Credentials cr) {
		User user = userServiceImpl.authenticate(cr);
		if(user != null)
			return "redirect:subjects.html";
		return "redirect:failed.html";
	}
}
