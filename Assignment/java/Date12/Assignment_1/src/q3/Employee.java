package q3;

import java.util.Scanner;

public class Employee {
	private String fname;
	private String lname;
	private long salary;
	
	public Employee() {

	}
	public Employee(String fname,String lname,long salary ) {
		this.fname = fname ;
		this.lname = lname;
		this.salary = salary ; 
	}
	
	public void setData() {
		System.out.println("Enter Employee First name : ");
		Scanner sc = new Scanner(System.in);
		fname = sc.nextLine();
		System.out.println("Enter Employee Last Name : ");
		lname = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		 while (true) {

	            salary = sc.nextLong();

	            if (salary > 0) {
	                System.out.println("Calculating...\n");
	                break;
	            } 
	            else {
	                System.out.println("Please Enter Correct Value !");
	            }
	        }
}
	public void getData() {
		System.out.println("Employee ID is:- "+fname);
		System.out.println("Employee Name is:- "+lname);
		System.out.println("Employee Salary is:- "+salary);
		System.out.println("Yearly Salary is:- "+(salary*12));
		System.out.println("10% increment in year Salary :- "+((salary*12)*1.1));
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setData();
		e1.getData();
			
		}
	}
//Enter Employee First name : 
//Mohit
//Enter Employee Last Name : 
//Phanse
//Enter Employee Salary : 
//0
//Please Enter Correct Value !
//0
//Please Enter Correct Value !
//-0
//Please Enter Correct Value !
//-1
//Please Enter Correct Value !
//100
//Calculating...
//
//Employee ID is:- Mohit
//Employee Name is:- Phanse
//Employee Salary is:- 100
//Yearly Salary is:- 1200
//10% increment in year Salary :- 1320.0
