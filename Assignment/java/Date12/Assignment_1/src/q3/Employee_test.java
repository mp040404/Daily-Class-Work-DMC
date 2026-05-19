package q3;

import java.util.Scanner;

public class Employee_test {

    private String fname;
    private String lname;
    private long salary;

    Scanner sc = new Scanner(System.in);

    public Employee_test(String fname, String lname, long salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public Employee_test() {
		
	}

	public void getFname() {
        System.out.println("Employee First Name is :- " + fname);
    }

    public void setFname() {
        System.out.println("Enter First Name :- ");
        fname = sc.nextLine();
    }

    public void getLname() {
        System.out.println("Employee Last Name is :- " + lname);
    }

    public void setLname() {
        System.out.println("Enter Last Name :- ");
        lname = sc.nextLine();
    }

    public void setSalary() {

        System.out.println("Enter Salary :- ");

        while (true) {

            salary = sc.nextLong();

            if (salary > 0) {
                System.out.println("Calculating...\n");
                break;
            } else {
                System.out.println("Please Enter Correct Value !");
            }
        }
    }

    public void getSalary() {

        System.out.println("Employee Salary is : " + salary);
        System.out.println("Yearly Salary is : " + (salary * 12));
        System.out.println("10% increment in Year Salary : " + ((salary * 12) * 1.1));
    }
    
   
}