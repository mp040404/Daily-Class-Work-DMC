package mock;

import java.util.Scanner;

public class Course {
	
	int c_id ;
	String title ; 
	Double marks;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int c_id, String title, Double marks) {
		super();
		this.c_id = c_id;
		this.title = title;
		this.marks = marks;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Course id");
		c_id = sc.nextInt();
		System.out.println("Course name ");
		title = sc.next();
		System.out.println("Course marks");
		marks = sc.nextDouble();
	}
	

	public int getC_id() {
		return c_id;
	}

	public void setC_id(Scanner sc) {
		this.c_id = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", title=" + title + ", marks=" + marks + "]";
	}
	
	

}
