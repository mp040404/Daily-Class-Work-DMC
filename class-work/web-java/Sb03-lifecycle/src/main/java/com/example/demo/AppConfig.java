package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public BoxImpl b1() {
		BoxImpl b = new BoxImpl();
		b.setBreadth(4);
		b.setHeight(2);
		b.setLength(6);
		return b;
	}
	
	@Bean
	public BoxImpl b2() {
		return new BoxImpl(10,5,6);
	}
}
