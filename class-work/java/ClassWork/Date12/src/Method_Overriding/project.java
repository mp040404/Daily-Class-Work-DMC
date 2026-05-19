package Method_Overriding;

import java.util.Scanner;

public class project extends person {
	int id;
	String name;
	
	public project() {
		
	}

	public project(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	
	public void setValue(Scanner sc) {
		super.setValue(sc);
		System.out.println("Enter Project id : ");
		id = sc.nextInt();
		System.out.println("Enter Project Name :");
		name = sc.next();
		
		
	}
	
	@Override
	public void getValue() {
		super.getValue();
		System.out.println("Project id : "+id);
		System.out.println("Project name :"+name);
	}
	
	
	
}
