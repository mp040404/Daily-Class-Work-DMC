package com.mohit.day02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
//		A while loop in Java repeatedly executes a block of code as long 
//		as a specified Boolean condition remains true. It is an entry-controlled 
//		loop, meaning the condition is checked before the code block is executed, 
//		so the loop body might not run at all if the condition is initially false.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number under 10 :");
		int a = sc.nextInt();
		
		while(a <= 10 ) {
			System.out.println(a);
			a++;
		}
	}
}
