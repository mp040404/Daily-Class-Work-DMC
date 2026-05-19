package mockBook;

import java.util.Scanner;

public class issue {
	int i_id;
	int b_id;
	int m_id;
	
	
	
	public issue() {
		// TODO Auto-generated constructor stub
	}
	
	public issue(int i_id, int b_id, int m_id) {
		super();
		this.i_id = i_id;
		this.b_id = b_id;
		this.m_id = m_id;
	}

	public int getI_id() {
		return i_id;
	}

	public int getB_id() {
		return b_id;
	}

	public int getM_id() {
		return m_id;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Issue id : ");
		i_id = sc.nextInt();
		System.out.println("Enter Book Id :");
		b_id = sc.nextInt();
		System.out.println("Enter Member Id : ");
		m_id = sc.nextInt();
	}
	

}
