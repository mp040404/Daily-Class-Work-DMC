package mockBook;

import java.util.Objects;
import java.util.Scanner;

public class member {
	
	int m_id;
	String name;
	String email;
	
	public member() {
		// TODO Auto-generated constructor stub
	}

	public member(int m_id, String name, String email) {
		super();
		this.m_id = m_id;
		this.name = name;
		this.email = email;
	}
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter Member ID ");
		m_id = sc.nextInt();
		System.out.println("Enter Member Name : ");
		name = sc.next();
		System.out.println("Enter Member Email : ");
		email = sc.next();
	}

	@Override
	public String toString() {
		return "member [m_id=" + m_id + ", name=" + name + ", email=" + email + "]";
	}

	public int getM_id() {
		return m_id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(m_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof member))
			return false;
		member other = (member) obj;
		return m_id == other.m_id;
	}
	
	

}
