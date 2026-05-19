package Student;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


class student implements Comparable<student> {
	
	int roll_no;
	String name;
	double marks;
	
	public student() {
		
	}
	
	public student(int roll_no, String name, double marks) {
		
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
	
	public void setValue(Scanner sc) {
		
		this.roll_no = sc.nextInt();
		this.name = sc.nextLine();
		this.marks = sc.nextDouble();
	}
	
	
	@Override
	public String toString() {
		return "student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(student o) {
		return this.roll_no-o.roll_no;
	}
}

public class main  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number you Wan't add Student Information : ");
		int size = sc.nextInt();
		student[] arr=new student[size];
		int sa = 0 ;
		
		int choice ;
		
	
		
		while(size != 0 ) {
			System.out.println("1 for Add Student");
			System.out.println("2 for display Student");
			System.out.println("3 for Student sort by roll_no (Asc order)");
			System.out.println("4 for Student sort by name (Desc order)");
			System.out.println("5 for Student sort by Marks (Desc order)");
			choice = sc.nextInt();
			
			
			switch(choice){
			case 1 :
					if(sa < size) {
						System.out.println("Add Student Details");
						System.out.println("Enter Student Roll number");
						System.out.println("Enter Student Name ");
						System.out.println("Enter Student Marks");
						arr[sa++] = new student(sc.nextInt(),sc.next(),sc.nextDouble());
					}else {
						System.out.println("Array is Full So Not Enter Value !");
						break;
					}
				break;
			case 2 :
				System.out.println("Display Student Details . ");
					for (student student : arr) {
						 if(student != null) {
						System.out.println(student.toString());
					}else {
						System.out.println("Student info not stored");
					 }
						 break;
					}
				break;
			case 3 :
				System.out.println("Student roll number sort by asc order");
				Arrays.sort(arr);
				for (student student : arr) {
					System.out.println(student.toString());
				}
				break;
			case 4 :
				System.out.println("Student Name sort by desc order");
					class StudentNameComparator implements Comparator<student>{

					@Override
					public int compare(student o1, student o2) {
						// TODO Auto-generated method stub
						return o2.name.compareTo(o1.name);
					}	
				}
				StudentNameComparator s = new StudentNameComparator();
				Arrays.sort(arr,s);
				for (student student : arr) {
					System.out.println(student.toString());
				}
				break ;
			case 5 : 
				System.out.println("Student Marks Sort by desc orderr");
				class StudentMarkComparator implements Comparator<student>{

					@Override
					public int compare(student o1, student o2) {
						return Double.compare(o2.marks, o1.marks);
					}
				}
				StudentMarkComparator c= new StudentMarkComparator();
				Arrays.sort(arr,c);
				for (student student : arr) {
					System.out.println(student.toString());
				}
				break ;
			}
			
		}
		sc.close();
	
	
	}
	
}
