package List;

import java.util.Scanner;

public class menu {
	
	public static int selectValue(Scanner sc) {
		
		int choice;
		System.out.println("----------------------------");
		System.out.println("1 for Add Student ");
		System.out.println("2 for Display Student");
		System.out.println("3 for Find Student");
		System.out.println("4 for Remove Student");
		System.out.println("5 for Arrenge Student Marks DEsc Order");
		System.out.println("6 for Arrenge Student Name Asce Order");
		System.out.println("7 for Arrenge Student Roll Number Asce Order");
		System.out.println("Enter you'r Choice ");
		
		System.out.println("----------------------------");
		return choice=sc.nextInt();
	}

}
