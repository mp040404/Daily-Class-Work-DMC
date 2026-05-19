package com.mohit.day02;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	private long salary;
	
	public Employee() {
		
	}
	public Employee(int id,String name,long salary ) {
		this.id = id ;
		this.name = name;
		this.salary = salary ; 
	}
	public void setData() {
		System.out.println("Enter Employee ID : ");
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		Scanner sc1 = new Scanner(System.in);
		name = sc1.nextLine();
		System.out.println("Enter Employee Salary : ");
		Scanner sc3 = new Scanner(System.in);
		salary =  sc3.nextLong();
	}
	public void getData() {
		System.out.println("Employee ID is:- "+id);
		System.out.println("Employee Name is:- "+name);
		System.out.println("Employee Salary is:- "+salary);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setData();
		e1.getData();
	}
}
