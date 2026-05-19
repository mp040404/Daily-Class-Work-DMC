package q2;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		
		if(sc.hasNextDouble()) 
		{
			double a = sc.nextDouble(); 
			System.out.println("Enter 2nd Number");
			//Scanner sc1 = new Scanner(System.in);
				if(sc.hasNextDouble()) 
				{
						double b = sc.nextDouble();
						
						System.out.println("Perfect ! ");
								double avg = (a+b)/2 ;
								System.out.println("Average is : "+avg);
						
				}
		}
		else
		{
			System.out.println("Error: ");
			
			
		}
		
	}
}
//Output
//Enter 1st Number
//10.23
//Enter 2nd Number
//20.33
//Perfect ! 
//Average is : 15.28
//______________________
//Enter 1st Number
//mohit
//Error: 

