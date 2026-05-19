package inheritance;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		student s = new student();
//		s.setvalue(sc);
//		s.getvalue();
		
//		emp e=new emp();
//		e.setvalue(sc);
//		e.getvalue();
		System.out.println("Enter number you want add in system :");
		int size = sc.nextInt();
		
		emp[] e = new emp[size];
		for(int i = 0 ; i < size ; i++) {
			e[i]=new emp();
		    e[i].setvalue(sc);
		}
		for(int i = 0 ; i<size;i++) {
			e[i].getvalue();
		}
			
		
	}

}
