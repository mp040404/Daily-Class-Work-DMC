package inheritance;

import java.util.Scanner;

public class person {

	private String name;
	
	public person() {
	}
	public person(String m) {
		name = m ;
	}
	public void setValue(Scanner sc) {
		System.out.println("Enter Name :");
		name = sc.next();
	}
	public void getValue() {
		System.out.println("Name : "+ name);
	}
}
