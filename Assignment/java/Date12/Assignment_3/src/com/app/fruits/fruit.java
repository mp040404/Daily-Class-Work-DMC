package com.app.fruits;

public class fruit {

		String color;
		double weight;
		String name;
		boolean isfresh;
		
	

		public fruit(String name,String color, double weight,  boolean isfresh) {
			super();
			this.color = color;
			this.weight = weight;
			this.name = name;
			this.isfresh = true;
		}
		
		public fruit() {
			// TODO Auto-generated constructor stub
		}

	
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isIsfresh() {
			return isfresh;
		}

		public void setIsfresh(boolean isfresh) {
			this.isfresh = isfresh;
		}

		public boolean isfresh() {
			return true;
		}
		
		public String taste() {
			return "no specific taste";
		}
		
		
		public String toString() {
		
		return "Name - " + name +
				"\nColor - " + color +
				"\nWeight - " + weight;
		}
}
