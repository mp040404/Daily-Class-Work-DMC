package com.app.fruits;

public class apple extends fruit {

	    public apple(String name, String color, double weight) {
	        super(name, color,weight, true);
	    }

		@Override
		public String taste() {
			
			return "sweet n sour";
		}
		

	    
}
