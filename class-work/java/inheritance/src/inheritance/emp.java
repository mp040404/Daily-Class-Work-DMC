package inheritance;

import java.util.Scanner;

public class emp extends person {

	private int empid;
	private double salary ;
	
	public emp() {
		
	}

	public emp(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	
	public void setValue(Scanner sc) {
		System.out.println("Enter Emp id :");
		empid = sc.nextInt();
		
		super.setValue(sc);
		
		System.out.println("Enter Emp Salary : ");
		salary = sc.nextDouble();
	}
	
	public void getValue() {
		System.out.println("Emp id : "+empid);
		super.getValue();
		System.out.println("SAlary : "+salary);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
