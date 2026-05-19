import java.util.Scanner;

public class BankAcc {
	
	int acc_no;
	String name;
	double balance;
	
	public BankAcc() {
		// TODO Auto-generated constructor stub
	}
	public BankAcc(int acc_no, String name, double balance) {
		
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}
	
	public void setAcc_no(Scanner sc ) {
		while(true) {
	        try {
	           
	            int num = sc.nextInt();

	            if(num >= 1) {
	                this.acc_no = num;
	                break;
	            } 
	            else {
	                System.out.println("Account number must be greater than 0.");
	                System.exit(0);
	            }

	        }
	        catch(Exception e) {
	            System.out.println("Invalid Input! Enter numbers only.");
	             break;
	
	        }
	    }
		
	}
	public void setName(Scanner sc) {
		
		this.name = sc.next();
	}
	public void setBalance(Scanner sc) {
		while(true) {
	        try {
	           
	           Double num1 = sc.nextDouble();

	            if(num1 >= 1) {
	                this.balance = num1;
	                break;
	            } 
	            else {
	                System.out.println("Account balance must be greater than 0.");
	                System.exit(0);
	            }

	        }
	        catch(Exception e) {
	            System.out.println("Invalid Input! Enter numbers only.");
	             break;
	
	        }
	    }
		
	}
	public int getAcc_no() {
		System.out.println("Acc_NO : "+acc_no);
		return acc_no;
	}
	public String getName() {
		System.out.println("Acc_Name  : "+name);
		return name;
	}
	public double getBalance() {
		System.out.println("Acc_Balance : "+balance);
		return balance;
	}
	
	

}
