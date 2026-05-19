package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		List<student> std = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter non zero value to run program : ");
		int size = sc.nextInt();
		
		int choise;
			
		while( size != 0) {
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("1 for add Student info");
			System.out.println("2 for Display Student Info");
			System.out.println("3. Find student on rollno");
			System.out.println("4. delete the student by given rollno");
			System.out.println("5. display all students sorted on roll no in asc order");
			System.out.println("6. display all students sorted on name in asc order");
			System.out.println("7. display all students sorted on marks in desc order");
			System.out.println("8. display student marks and their percentange");
			choise = sc.nextInt();
		
		switch(choise) {
		
		case 1 :
//			System.out.println("Enter Detalis of Student ");
//			for (int i = 0; i < size; i++) {
//				System.out.println("Enter Roll_no , Name , Marks");
//				std.add(new student(sc.nextInt(),sc.next(),sc.nextDouble()));
//			}
//			break;
			
			std.add(new student(105,"Ram",175.0));
			std.add(new student(102,"ramesh",159.90));
			std.add(new student(103,"Mohan",195.09));
			std.add(new student(104,"joker",185.60));
			std.add(new student(101,"King",145.40));
			break;
			
		case 2 : 
			System.out.println("Display info");
			for (student student : std) {
				System.out.println(student);
			}
			break;
			
		case 3:
			System.out.println("Find student on rollno");
			System.out.println("Enter roll number you find ");
			student s = new student();
			s.roll_no = sc.nextInt();
			System.out.println("index of employee with id "+s.roll_no+" is  "+std.indexOf(s));
			for (student s1: std) {
			if(s1.getRoll_no() == s.roll_no ) {
				System.out.println("Student Found.");
				System.out.println(s1);
			}
			}
			if(std.indexOf(s)<=0) {
					System.out.println("Student not found.");
			}
			break;
		
		case 4:
			
			System.out.println("Enter roll number to remove:");
			student s1 = new student();
			s1.roll_no = sc.nextInt();
			boolean isRemoved = std.remove(s1);
			if (isRemoved) {
			    System.out.println("Removed Student with roll no: " + s1.roll_no);
			} else {
			    System.out.println("Student not found or already removed!");
			}
			
			break;
		case 5 :
			System.out.println(" display all students sorted on roll no in asc order ");
			Collections.sort(std);
			for (student student : std) {
				System.out.println(student.toString()); 
			}
			break;
		case 6:
			System.out.println("display all students sorted on name in asc order");
			class StudentNameComparator implements Comparator<student>{
				@Override
				public int compare(student o1, student o2) {
					return o1.getName().compareToIgnoreCase(o2.getName());
				}
				
			}
			StudentNameComparator snc = new StudentNameComparator();
			Collections.sort(std,snc);
			for (student student : std) {
				System.out.println(student.toString());
			}
			break;
		case 7 : 
			System.out.println("display all students sorted on marks in desc order");
			class StudentMarksComparator implements Comparator<student>{

				@Override
				public int compare(student o1, student o2) {
				
					return Double.compare(o2.marks, o1.marks);
				}
				
			}
			
			Collections.sort(std,new StudentMarksComparator());
			for (student student : std) {
				System.out.println(student.toString());
			}
			break;
			
		case 8 : 
			System.out.println("8. display student marks and their percentange");
			for (student student : std) {
				System.out.println("Student Name : " + student.getName() + " & Percentage is :" + student.CalculatePercentage()+"%");
				
			}
		}
		}
	}
}
