package composition;

import java.util.Scanner;

public class student {
	int rollno ;
	String name ;
	pg p;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(int rollno, String name,pg p) {
		this.rollno = rollno;
		this.name = name;
		this.p = p ;
	}
	public void addp() {
		p = new pg();
		System.out.println("Enter your Pg Details  - ");
		p.setValue();
	}
	public void setValue(Scanner sc) {
		System.out.println("Enter Student Roll no : ");
		rollno = sc.nextInt();
		
		
		System.out.println("Enter Student Name : ");
		name = sc.next(); 
	}
	
	public void DisplayStudent() {
		System.out.println("Student Roll no : "+rollno);
		System.out.println("Student name : "+name);
		if (p != null) // 
			p.getDisplay();
	}
	}
	


