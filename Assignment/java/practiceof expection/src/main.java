import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Wan't Add : ");
		int size = sc.nextInt();
		BankAcc[] arr = new BankAcc[size];
		while(size != 0) {
		for(int i = 0; i < arr.length; i++) {
		    arr[i] = new BankAcc();
		}
		for(BankAcc s:arr) {
			System.out.println("Enter Account number");
			s.setAcc_no(sc);
			System.out.println("Enter NAme :");
			s.setName(sc);
			System.out.println("Enter Balance : ");
			s.setBalance(sc);
		}
		for(BankAcc s:arr) {
			s.getAcc_no();
			s.getName();
			s.getBalance();
		}
		}
	}
}
