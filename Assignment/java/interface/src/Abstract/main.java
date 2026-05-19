package Abstract;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		shape s ;
		int c ;
		System.out.println("Enter 1 for circle");
		System.out.println("Enter 2 for square ");
		System.out.println("Enter 3 for rectangle");
		System.out.println("Enter 0 for exit");
		c= sc.nextInt();
		while(c != 0) {
			switch(c){
			case 1 :
					circle r = new circle();
					r.setValue(sc);
					r.calculatearea();
					System.exit(0);
					break;
			case 2 :
					square s = new square();
					s.setValue(sc);
					s.calculatearea();
					System.exit(0);
					break;
			case 3 : 
					rectangle b = new rectangle();
					b.setValue(sc);
					b.calculatearea();
					System.exit(0);
					break;
			default :
					System.out.println("Invalid Input .. . ! ?");
					break;
			}
			break;
		}
	}

}
