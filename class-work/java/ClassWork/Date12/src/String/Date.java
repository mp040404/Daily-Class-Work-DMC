package String;

import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;
	
	public Date() { }

	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
//	public void setValue(Scanner sc) {
//		System.out.println("Enter Day : ");
//		day = sc.nextInt();
//		System.out.println("Enter Month : ");
//		month = sc.nextInt();
//		System.out.println("Enter Year : ");
//		year = sc.nextInt();
//	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
