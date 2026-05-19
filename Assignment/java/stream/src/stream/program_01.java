package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class program_01 {
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		List<emp> emps = new ArrayList<>();
		
		System.out.println();
		System.out.println("**************************************************************************************************");
		System.out.println("1. add Emps");
		System.out.println("2. display all the employees in sorted order of name");
		System.out.println("3. display all the employees in sorted order of salary in desc");
		System.out.println("4. display all the employees with salary >30000 in desc order");
		System.out.println("5. display all the emps with name staring with S");
		System.out.println("6. display emp with salary>40000 after giving raise of 20%");
		System.out.println("7. display all the distinct employee data. (to test repeat some employee data in collection)");
		System.out.println("0. Exit");
		System.out.println("Enter Choice := ");
		System.out.println("**************************************************************************************************");
		System.out.println();
		int c = sc.nextInt();
		System.out.println();
		
		while(c != 0) {
			
			switch(c) {
			case 1 :
			{
//				emp e = new emp();
//				e.accept(sc);
//				emps.add(e);
				
				emps.add(new emp(1,"Mohan",25000.00));
				emps.add(new emp(1,"Sahil",35000.00));
				emps.add(new emp(9,"Shivkumar",15250.00));
				emps.add(new emp(11,"Sham",41234.00));
				emps.add(new emp(5,"King",16541.00));
				emps.add(new emp(7,"Ram",35236.00));
				emps.add(new emp(1,"Lion",55412.00));
				emps.add(new emp(4,"Joferry",15641.00));
				emps.add(new emp(1,"Ranera",36413.00));
				emps.add(new emp(1,"Jons",12579.00));
				emps.add(new emp(10,"Lannister",54632.00));
				System.out.println("Emp Added");
				for (emp emp : emps) {
					System.out.println(emp);
				}
				
			}break;
			case 2:
			{
				System.out.println("display all the employees in sorted order of name");
				
				emps.stream().sorted((e , e1) -> e.getName().compareToIgnoreCase(e1.getName())).forEach(e -> System.out.println(e));
			}break;
			case 3:
			{
				System.out.println("display all the employees in sorted order of salary in desc");
				
				emps.stream().sorted((e , e1) -> Double.compare(e1.salary, e.salary)).forEach(e -> System.out.println(e));
			}break;
			case 4:
			{
				System.out.println("display all the employees with salary >30000 in desc order");
				emps.stream().filter(e -> e.getSalary() > 30000).sorted((e ,e1) -> Double.compare(e1.salary, e.salary)).forEach(e -> System.out.println(e));;
				
			}break;
			case 5:
			{
				System.out.println("display all the emps with name staring with S");
				
				emps.stream().filter(e -> e.getName().startsWith("S")).forEach(e -> System.out.println(e));;
				
			}break;
			
			case 6:
			{
				System.out.println("display emp with salary>40000 after giving raise of 20%");
				
				emps.stream().filter(e -> e.getSalary() > 40000).map(e -> e.salary * 1.2).forEach(e -> System.out.println(e));
			}break;
			
			case 7:
			{
				System.out.println("display all the distinct employee data.");
				
				emps.stream().distinct().forEach(e -> System.out.println(e));
			}break;
			}
			System.out.println();
			System.out.println("**************************************************************************************************");
			System.out.println("1. add Emps");
			System.out.println("2. display all the employees in sorted order of name");
			System.out.println("3. display all the employees in sorted order of salary in desc");
			System.out.println("4. display all the employees with salary >30000 in desc order");
			System.out.println("5. display all the emps with name staring with S");
			System.out.println("6. display emp with salary>40000 after giving raise of 20%");
			System.out.println("7. display all the distinct employee data. (to test repeat some employee data in collection)");
			System.out.println("0. Exit");
			System.out.println("Enter Choice := ");
			System.out.println("**************************************************************************************************");
			System.out.println();
			c = sc.nextInt();
			System.out.println();
		}
		
	}

}
 