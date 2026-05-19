package mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
	
	class BookNotFoundException extends Exception {
	    public BookNotFoundException(String msg) {
	        super(msg);
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> std = new ArrayList<>();
		List<Course> cor = new ArrayList<>();
		List<registration> reg = new ArrayList<>();
		
		
		
	
		
			for (Course co : cor) {
				System.out.println(co);
			}
			for (registration re : reg) {
				System.out.println(re);
			   }
			   
		
		
		System.out.println("1 for Add Student ");
		System.out.println("2 for Add Course ");
		System.out.println("3 for Display Student ");
		System.out.println("4 for Display Course ");
		System.out.println("5 for Add Registration");
		System.out.println("6 Display REgistration ");
		System.out.println("7 display all students and Courses");
		System.out.println("Enter You'r option ::");
		
		int option = sc.nextInt();
		sc.nextLine();
		 
		while(option != 0 ) {
			switch(option) {
			case 1 :
			{
				Student s = new Student();
				s.accept(sc);
				std.add(s);
				System.out.println("Added");
			}
			break;
			case 2 :
			{
				Course c = new Course();
				c.accept(sc);
				cor.add(c);
				System.out.println("Added");
			}break;
			case 3 :
			{
				
				registration r = new registration();
				r.accept(sc);
				  boolean found = false;

				    for(Student s : std) {
				        for(Course c : cor) {
				            if(s.getS_id() == r.getRs_id() && c.getC_id() == r.getRc_id()) {
				                reg.add(r);
				                System.out.println("Registration successful ✅");
				                found = true;
				                break;
				            }
				        }
				    }

				    if(!found) {
				        System.out.println("Invalid Student ID or Course ID ❌");
				    }
				
			}break;
			case 4 : 
			{
				if(std.isEmpty()) {
			    System.out.println("Values Not Stored !");
			} else {
			    for(Student s : std) {
			        System.out.println(s);
			    }
			}
				
			}
				break;
			default:
		        System.out.println("Invalid Option!");
		        break ;
			
			}

			System.out.println("1 for Add Student ");
			System.out.println("2 for Add Course ");
			System.out.println("3 for Display Student ");
			System.out.println("4 for Display Course ");
			System.out.println("5 for Add Registration");
			System.out.println("6 Display REgistration ");
			System.out.println("7 display all students and Courses");
			System.out.println("Enter ReOption ");
			option = sc.nextInt();
		 
		}
		
		
	}

}
