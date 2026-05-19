package equal;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class person {
	
	String name ;
	
	public person() {
	}
	public person(String s ) {
		name = s ;
	}
	public void setValue(Scanner sc) {
		System.out.println("Enter Name :");
		name = sc.next();
	}
	public void getValue() {
		System.out.println("Name is :" + name );
	}
	
}
