package com.app.fruits;

public class mango extends fruit {

    
	public mango(String name, String color, double weight) {
		super(name, color, weight, true);
	}


	@Override
	public String taste() {
		return "sweet";
	}
}
