package q3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class q3 {
	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dmc";
	public static final String DB_user = "mohit";
	public static final String DB_pass = "mohit";

	static {
			try {
				Class.forName(DB_Driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}
	public static void main(String[] args) {
//		Change password for the given user id.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id you Want Update Password");
			int id = sc.nextInt();
			System.out.println("Enter Password TO update");
			String pass = sc.next();
			
			try(Connection con = DriverManager.getConnection(DB_URL,DB_user,DB_pass)){
					try(Statement stmt=con.createStatement()){
						String sql = String.format(
							    "UPDATE users SET password = '%s' WHERE id = %d",
							    pass, id);
						System.out.println("SQl : "+sql);
						int count = stmt.executeUpdate(sql);
						System.out.println("Rows Inserted : " + count);
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	

}
