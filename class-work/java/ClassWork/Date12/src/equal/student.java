package equal;

import java.util.Scanner;

public class student extends person {

	int roll_no;
	double marks;
	double total;
	
	
	public student() {
		
	}
	public student(int r, double m , double t) {
		roll_no = r ;
		marks = m ;
		total = t ;
	}
	@Override 
	public void setValue(Scanner sc) {
		System.out.println("Enter Student Roll no :");
		roll_no = sc.nextInt();
		super.setValue(sc);
		System.out.println("Enter Student Marks : ");
		marks = sc.nextDouble();
		System.out.println("Enter Total Mark :");
		total = sc.nextInt();
	}
	@Override
	public void getValue() {
		System.out.println("Roll no : "+roll_no);
		super.getValue();
		System.out.println("Marks : "+marks);
	}
	
	public void calculatTotalMarks() {
		System.out.println("Total persentage : "+ ((marks/total)*100) + "%");
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		else if(obj instanceof student) {
			student d=(student) obj;
			if(this.marks == d.marks) {
				return true;
				}
		}	
		return false;
	}
	
}
