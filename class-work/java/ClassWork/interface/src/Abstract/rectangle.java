package Abstract;

import java.util.Scanner;

public class rectangle extends shape {
	int l ;
	int b ;
	
	
	public rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	public void setValue(Scanner sc) {
		System.out.println("Enter length :");
		l=sc.nextInt();
		System.out.println("Enter breath :");
		b=sc.nextInt();
	}

	@Override
	public void calculatearea() {
		float area = l * b ;
		System.out.println("Area of Rectangle : "+area);
		
	}
	
	

}
