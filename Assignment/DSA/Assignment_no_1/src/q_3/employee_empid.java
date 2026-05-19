package q_3;

import java.util.Scanner;

public class employee_empid {
	
	int empid;
	String name;
	
	public employee_empid() {
		// TODO Auto-generated constructor stub
	}

	public employee_empid(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		employee_empid[] emp = new employee_empid[3];
		emp[0]=new employee_empid(1,"Mohan");
		emp[1]=new employee_empid(2,"Kiran");
		emp[2]=new employee_empid(3,"Ram");
		
		
		for (employee_empid employee : emp) {
			System.out.println(employee);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id to find it :");
		int m = sc.nextInt();
		
		boolean found = false;
		
		
		for(int i = 0 ; i < emp.length; i++) {
			if(emp[i].empid == m) {
				System.out.println("Employee Found at index : "+i);
				System.out.println(emp[i]);
				found =true;
				break;
			}
		}
		if(!found) {
			System.out.println("Employee not Found");
		}
		
		
	}

}
