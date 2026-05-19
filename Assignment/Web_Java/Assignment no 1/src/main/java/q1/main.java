package q1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/dmc";
	public static final String DB_uname = "mohit";
	public static final String DB_pass = "mohit";
	
	static {
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
			try(Connection con = DriverManager.getConnection(DB_URL,DB_uname,DB_pass)){
				
				try(Statement stmt = con.createStatement()){
					
					String sql = "Select * from users";
					try(ResultSet rs = stmt.executeQuery(sql)){
						while(rs.next()) {
							int id = rs.getInt("id");
							String name = rs.getString("name");
							String password = rs.getString("password");
							String email = rs.getString("email");
							Date birth = rs.getDate("birth");
							String addr = rs.getString("addr");
							String roll = rs.getString("roll");
							
							System.out.printf("%d,%s,%s,%s,%s,%s,%s\n",id,name,password,email,birth,addr,roll);
						}
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		

	}

}
