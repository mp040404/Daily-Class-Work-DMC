package Method_Overriding;

import java.util.Scanner;

public class student extends person {

	int roll_no;
	double marks;
	
	public student() {
		
	}
	public student(int r, double m ) {
		roll_no = r ;
		marks = m ;
	}
	@Override 
	public void setValue(Scanner sc) {
		System.out.println("Enter Student Roll no :");
		roll_no = sc.nextInt();
		super.setValue(sc);
		System.out.println("Enter Student Marks : ");
		marks = sc.nextDouble();
	}
	@Override
	public void getValue() {
		System.out.println("Roll no : "+roll_no);
		super.getValue();
		System.out.println("Marks : "+marks);
	}
	
}
