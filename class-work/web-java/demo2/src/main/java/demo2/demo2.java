package demo2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo2 {
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
	static public void main(String[] args) throws SQLException {
		
		try(Connection con = DriverManager.getConnection(DB_URL,DB_User,DB_pass))
		{
			try(Statement stmt = con.createStatement())
			{	
				String sql = "Select * from User ";
				try(ResultSet rs = stmt.executeQuery(sql)){
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String password = rs.getString("password");
						String email = rs.getString("email");
						Date birth = rs.getDate("birth");
						String addr = rs.getString("addr");
						String role = rs.getString("role");
						
						System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", id, name, password, email, addr, role, birth);
					}
				}
			}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
