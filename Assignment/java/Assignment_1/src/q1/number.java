package q1;


import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		
		System.out.println("given number : "+ a);
		System.out.println("Integer into Binary : "+ Integer.toBinaryString(a));
		System.out.println("Integer into Octal equivalent : "+ Integer.toOctalString(a));
		System.out.println("Integer into Hexadecimal equivalent : "+ Integer.toHexString(a));
	}

 }
//output
//Enter Number
//20
//given number : 20
//Integer into Binary : 10100
//Integer into Octal equivalent : 24
//Integer into Hexadecimal equivalent : 14
