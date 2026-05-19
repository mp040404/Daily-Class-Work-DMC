import java.util.Scanner;

public class IF_Else {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if (m > 20) {
			System.out.println("You Are Enter Value is greater than 20 and no is  "+ m);
			
		}
		else 
		{
			System.out.println("You Are Enter Value is less than 20 and no is  "+ m);
		}
		
		
		
	}

}
