package Abstract;

import java.util.Scanner;

public class circle extends shape {

	int radius;
	
	public circle() {
		// TODO Auto-generated constructor stub
	}
	
	public circle(int r) {
		radius = r ;
	}
	
	public void setValue (Scanner sc) {
		System.out.println("Enter Radius :");
		radius = sc.nextInt();
	}
	@Override
	public void calculatearea() {
		
		float area = (float) ((radius * radius) * (3.14)) ;
		System.out.println("Area Of Circle : "+ area);
	}
	

}
