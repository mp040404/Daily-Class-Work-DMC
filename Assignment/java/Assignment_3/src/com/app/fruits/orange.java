package com.app.fruits;

public class orange extends fruit {

	public orange(String name, String color, double weight) {
		super(name, color, weight, true);
	}

	@Override
	public String taste() {
		
		return "sour";
	}
	

}
