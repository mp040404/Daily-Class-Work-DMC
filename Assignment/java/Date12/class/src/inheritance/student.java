package inheritance;

import java.util.Scanner;

import Association.person;

public class student extends person{
		
	private int roll_no;
	private int marks ;
	
	public student() {
	}

	public student(int roll_no, int marks) {
		
		this.roll_no = roll_no;
		this.marks = marks;
	}
	
	public void setvalue(Scanner sc) {
		System.out.println("Enter Roll Number : ");
		roll_no = sc.nextInt();
		
		super.setvalue(sc);
		
		System.out.println("Enter marks no :");
		marks = sc.nextInt();
		
	}
	
	public void getvalue() {
		System.out.println("Rollno - " + roll_no);
		super.getvalue();
		System.out.println("Marks - " + marks);

	}
		

}
