package Abstract;

import java.util.Scanner;

public class square extends shape {

	int l;
	
	public square() {
		// TODO Auto-generated constructor stub
	}
	
	public square(int l) {
		this.l=l;
	}
	
	public void setValue(Scanner sc) {
		System.out.println("Enter length :");
		l=sc.nextInt();
	}
	@Override
	public void calculatearea() {
		float area =  l * l ;
		System.out.println("Area of Square : "+area);
	}

}
