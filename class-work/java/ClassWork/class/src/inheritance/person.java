package inheritance;

import java.util.Scanner;

public class person {
	private String name;
	
	public person() {
	}
	
	public person(String n) {
		name = n ;	}
	
	public void setvalue(Scanner sc) {
		
		System.out.println("Enter Name :");
		name = sc.next() ;
		
	}
	public void getvalue() {
		System.out.println("Name - " + name);

	}
}
