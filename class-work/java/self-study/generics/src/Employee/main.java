package Employee;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


class employee implements Comparable<employee> {
	
	int id;
	String name;
	double salary;
	
	public employee() {
		// TODO Auto-generated constructor stub
	}
	
	public employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setValue(Scanner sc) {
		
		this.id = sc.nextInt();
		this.name = sc.nextLine();
		this.salary = sc.nextDouble();
	}
	
	
	@Override
	public String toString() {
		return "employee [id= " + id + ", name= " + name + ", salary= " +salary  + "]";
	}

	@Override
	public int compareTo(employee o) {
		return this.id-o.id;
	}
}

public class main  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number you Wan't add Employee Information : ");
		int size = sc.nextInt();
		employee[] arr=new employee[size];
		int sa = 0 ;
		
		int choice ;
		
	
		
		while(size != 0 ) {
			System.out.println("1 for Add emp");
			System.out.println("2 for display emp");
			System.out.println("3 for emp sort by id (Asc order)");
			System.out.println("4 for emp sort by name (Desc order)");
			System.out.println("5 for emp sort by salary (Desc order)");
			choice = sc.nextInt();
			
			
			switch(choice){
			case 1 :
					if(sa < size) {
						System.out.println("Add Employee Details");
						System.out.println("Enter Emp id number");
						System.out.println("Enter emp Name ");
						System.out.println("Enter emp salary");
						arr[sa++] = new employee(sc.nextInt(),sc.next(),sc.nextDouble());
					}else {
						System.out.println("Array is Full So Not Enter Value !");
						break;
					}
				break;
			case 2 :
				System.out.println("Display emp Details . ");
					for (employee e : arr) {
						 if(e != null) {
						System.out.println(e.toString());
					}else {
						System.out.println("emp info not stored");
					 }
						 break;
					}
				break;
			case 3 :
				System.out.println("Employee id number sort by asc order");
				Arrays.sort(arr);
				for (employee e : arr) {
					System.out.println(e.toString());
				}
				break;
			case 4 :
				System.out.println("Employee Name sort by desc order");
					class EmployeeNameComparator implements Comparator<employee>{

					@Override
					public int compare(employee o1, employee o2) {
						// TODO Auto-generated method stub
						return o2.name.compareTo(o1.name);
					}	
				}
				EmployeeNameComparator s = new EmployeeNameComparator();
				Arrays.sort(arr,s);
				for (employee e : arr) {
					System.out.println(e.toString());
				}
				break ;
			case 5 : 
				System.out.println("Student Marks Sort by desc orderr");
				class EmployeeMarkComparator implements Comparator<employee>{

					@Override
					public int compare(employee o1, employee o2) {
						return Double.compare(o2.salary, o1.salary);
					}
				}
				EmployeeMarkComparator c= new EmployeeMarkComparator();
				Arrays.sort(arr,c);
				for (employee e : arr) {
					System.out.println(e.toString());
				}
				break ;
			}
			
		}
	}
}
