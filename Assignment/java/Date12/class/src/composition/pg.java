package composition;

import java.util.Scanner;

public class pg {
	
	private int room_no ;
	private int pgid ;
	
	public pg() {

	}

	public pg(int room_no, int pgid) {
		this.room_no = room_no;
		this.pgid = pgid;
	}
	
	public void setValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter room number : ");
		room_no = sc.nextInt();
		System.out.println("Enter pg Id : ");
		pgid = sc.nextInt();
	}
	
	public void getDisplay() {
		System.out.println("Room no : " + room_no);
		System.out.println("PG Id : " + pgid);
		
	}
	
	
}
