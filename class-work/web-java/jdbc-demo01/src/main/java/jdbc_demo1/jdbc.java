package jdbc_demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc {
	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dmc";
	public static final String DB_User = "mohit";
	public static final String DB_pass = "mohit";
	
	static {
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name :");
		String email = sc.nextLine();
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		// create connection
				try(Connection con = DriverManager.getConnection(DB_URL, DB_User, DB_pass)) {
					// create statement
					try(Statement stmt = con.createStatement()) {
						// execute query and process result
						String sql = String.format("SELECT * FROM user WHERE uname='%s' AND password='%s'", email, password);
						System.out.println("SQL: " + sql);
						try(ResultSet rs = stmt.executeQuery(sql)) {
							if(rs.next()) {
								System.out.println("Login Successful");
								String uname = rs.getString("uname");
								System.out.println("Welcome, " + uname );
							}
							else
								System.out.println("Login Failed");
						}
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	}

