package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {
	
	public static void display(List<Student> std) {

		for (Student s : std) {
			System.out.println(s.toString());
		}
		
	}

	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		List<Student> std = new ArrayList<>();

//		Set<Student> std = new LinkedHashSet();
		
		
		
		
	
			
		int choice;
		while ((choice = menu.selectValue(sc)) != 0) {
			
			switch (choice) {
			case 1 :
			{
				Student m = new Student();
//				System.out.println("Enter Student Value :");
//				std.add(m.setValue(sc));
				
				std.add(new Student(105,"Ram",175.0));
				std.add(new Student(102,"ramesh",159.90));
				std.add(new Student(103,"Mohan",195.09));
				std.add(new Student(104,"joker",185.60));
				std.add(new Student(101,"King",145.40));
				
			}
				break;
			case 2 :
			{
				System.out.println("Display Student Info : ");
				display(std);
			}
				break;
			case 3 :
			{
				System.out.println("Find student on rollno");
				System.out.println("Enter roll number you find ");
				Student s = new Student();
				s.roll_no = sc.nextInt();
				System.out.println(std.indexOf(s));
				int index = std.indexOf(s) ;
				if(index != -1) {
					for (Student s1: std) {
					if(s1.getRoll_no() == s.roll_no ) {
						System.out.println("Student Found.");
						System.out.println(s1);
					}
				}
					}else {
						System.out.println("Student not Found !");
					}
			}
				break;
			case 4 :
			{
				System.out.println("Enter Roll Number you are Deleted");
				Student m = new Student() ;
				m.roll_no = sc.nextInt();
				boolean index = std.remove(m);
				if(index) {
					System.out.println("Student Are Remove !");
				}else {
					System.out.println("Student not Found ");
				}
			}
			break;
			case 5 :
			{
				System.out.println("Student Info in desc order ");
				class StudentMarksCompatator implements Comparator<Student>{
					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.marks, o1.marks);
					}	
				}
				StudentMarksCompatator st = new StudentMarksCompatator();
				Collections.sort(std,st);
				display(std);
			}
				break;
			case 6:
			{
				System.out.println("Student Info Sort By Name asc");
				class StudentNameComparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						
						return o1.name.compareToIgnoreCase(o2.name);
					}
					
				}
				StudentNameComparator st = new StudentNameComparator();
				Collections.sort(std,st);
				display(std);
			}
			break;
			
			case 7 :
			{
				System.out.println("Display Student Info Roll_no In Asc Order");
				Collections.sort(std);
				display(std);
				
				
			}
			break;
			
			default:
				System.out.println("Enter Wrong Value ! ");
				break;
			}
		
			
		}
		
		
	}


}
