package mock;

import java.util.Scanner;

public class Student {

	int s_id;
	String name;
	String mail;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int s_id, String name, String mail) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.mail = mail;
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Sudent id : ");
		s_id = sc.nextInt();
	
		System.out.print("Enter Student Name : ");
		name = sc.next();
		System.out.println("Enter Student email :");
		mail = sc.next();
		
	}

	
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", mail=" + mail + "]";
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(Scanner sc) {
		this.s_id = sc.nextInt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
