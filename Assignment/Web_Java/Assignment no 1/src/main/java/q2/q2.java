package q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class q2 {

	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver" ;
	public static final String DB_URl = "jdbc:mysql://localhost:3306/dmc" ;
	public static final String DB_name = "mohit" ;
	public static final String DB_pass = "mohit" ;
	static
	{
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		System.out.println("Enter email");
		String email = sc.nextLine();
		System.out.println("Enter Birth-Day yyyy-mm-dd");
		String birth = sc.next();
		System.out.println("Enter Address ");
		String addr = sc.next();
		System.out.println("Enter Role - 0");
		int roll = sc.nextInt();
		try(Connection con=DriverManager.getConnection(DB_URl,DB_name,DB_pass)){
			
			try(Statement stmt=con.createStatement()){
				String sql = String.format(
						"Insert into users(name,password,email,birth,addr,roll) VALUES('%s','%s','%s','%s','%s',%d)",
						name, password, email, birth, addr, roll);
				System.out.println("Sql : "+sql);
				int count = stmt.executeUpdate(sql);
				System.out.println("Rows Inserted : "+count);
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
