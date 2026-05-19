package List;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student> {

	int roll_no;
	String name;
	double marks;
	
	public Student() {
		
	}

	public Student(int roll_no, String name, double marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public Student setValue(int roll_no, String name, double marks) {
		System.out.print("Enter Roll number of Student :");
		this.roll_no = roll_no;
		System.out.println("Enter name of Student");
		this.name = name;
		System.out.println("Enter Marks of Student");
		this.marks = marks;
		return this;
		
	}
	public Student setValue(Scanner sc) {
		System.out.print("Enter Roll number of Student :");
		roll_no = sc.nextInt();
		sc.nextLine(); 
		System.out.println("Enter name of Student");
		name = sc.nextLine();
		System.out.println("Enter Marks of Student");
		marks = sc.nextDouble();
		return this;
		
	}

	
	public int getRoll_no() {
		return roll_no;
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return roll_no == other.roll_no;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.roll_no - o.roll_no;
	}
	
	
	
	
}
