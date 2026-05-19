package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController {

	@PostMapping("/hello")
	public String sayHello(@RequestParam("uname")String uname,Model model) {
		String result = uname.toUpperCase();
		model.addAttribute("cname",result);
		return "welcome";
		
	}
}
