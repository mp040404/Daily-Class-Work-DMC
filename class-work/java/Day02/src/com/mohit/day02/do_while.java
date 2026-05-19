package com.mohit.day02;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {

		
//		The Java do-while loop is an exit-controlled
//		loop that guarantees the code block is executed 
//		at least once, before checking the condition. 
//		This distinguishes it from other loops like the 
//		while loop, which checks the condition first 
//		and may not run at all.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number under 10 :");
		int a = sc.nextInt();
		do{
			System.out.println(a);
			a++;
		}while(a<=50);
	}
}