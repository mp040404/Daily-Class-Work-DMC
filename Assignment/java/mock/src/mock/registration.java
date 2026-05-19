package mock;

import java.util.Scanner;

public class registration {
	
	int r_id;
	int rs_id;
	int rc_id;
	
	public int getR_id() {
		return r_id;
	}

	public int getRs_id() {
		return rs_id;
	}

	public int getRc_id() {
		return rc_id;
	}

	public registration() {
		// TODO Auto-generated constructor stub
	}

	public registration(int r_id, int s_id, int c_id) {
		super();
		this.r_id = r_id;
		this.rs_id = s_id;
		this.rc_id = c_id;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter Registration id : ");
		r_id=sc.nextInt();
		System.out.println("Enter Student id : ");
		rs_id = sc.nextInt();
		System.out.println("Enter Course id : ");
		rc_id = sc.nextInt();
	}

	@Override
	public String toString() {
		return "registration [r_id=" + r_id + ", s_id=" + rs_id + ", c_id=" + rc_id + "]";
	}
	

}
