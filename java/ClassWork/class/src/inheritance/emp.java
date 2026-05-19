package inheritance;

import java.util.Scanner;

import Association.person;

public class emp extends person {

	private int emp_id;
	private long mobile;
	
	public emp() {
	
	}

	public emp(int emp_id, long mobile) {
		this.emp_id = emp_id;
		this.mobile = mobile;
	}
	
	public void setvalue(Scanner sc) {
		System.out.println("Enter Employee id : - ");
		emp_id = sc.nextInt();
		
		super.setvalue(sc);
		
		System.out.println("Enter Employee Mobile : - ");
		mobile = sc.nextLong();
	}
	
	public void getvalue() {
		System.out.println("Emp id : = "+emp_id);
		super.getvalue();
		System.out.println("Emp Mobile no : = "+mobile);
	}
}
