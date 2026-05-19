package q_3;

import java.util.Scanner;

public class employee_empname {
	
	int empid;
	String name;
	
	public employee_empname() {
		// TODO Auto-generated constructor stub
	}

	public employee_empname(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		employee_empname[] emp = new employee_empname[3];
		emp[0]=new employee_empname(1,"Mohan");
		emp[1]=new employee_empname(2,"Kiran");
		emp[2]=new employee_empname(3,"Ram");
		
		
		for (employee_empname employee : emp) {
			System.out.println(employee);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp name to find it :");
		String searchName = sc.nextLine();
		
		boolean found = false;
		
		
		for(int i = 0 ; i < emp.length; i++) {
			if (emp[i].name.equals(searchName)) {   
                System.out.println("Employee found at index: " + i);
                System.out.println(emp[i]);
                found = true;
                break;
            }
		}
		if(!found) {
			System.out.println("Employee not Found");
		}
		
		
	}

}
