import java.util.Scanner;

public class string {
	
	
	public static int menu() {
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
		
		
	}

	public static void main(String[] args) {
		
		int choice;
		while((choice = menu()) != 0) {
		switch(choice) {
		case 1 : 
				System.out.println("Login in 1st");
		break;
		case 2 :
				System.out.println("Login in 2nd");
		break;
		default :
				System.out.println("Login in System");
		break;
		}

	}
	}
	

}