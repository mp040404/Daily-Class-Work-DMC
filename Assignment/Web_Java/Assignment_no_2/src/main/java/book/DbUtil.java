package book;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_Url = "jdbc:mysql://localhost:3306/dmc";
	public static final String DB_name = "mohit";
	public static final String DB_pass = "mohit";
	
	static {
		try {
			Class.forName(DB_Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection connect() throws Exception{
		Connection con = DriverManager.getConnection(DB_Url, DB_name, DB_pass);
		return con;
	}

}
