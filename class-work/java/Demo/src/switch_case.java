import java.util.Scanner;

public class switch_case {

	public static void main (String[] args) {
		System.out.println("Enter Number \n 1 fro add \n 2 for substract");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a ,b ;
		System.out.println("Enter 1st Number");
		Scanner sc1 = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		Scanner sc2 = new Scanner(System.in);
		b = sc.nextInt();
		switch(m) {
		case 1 : 		
					System.out.println(a + b);
		break;
		case 2:
					System.out.println(a - b);
		break;
		}
	}
}
