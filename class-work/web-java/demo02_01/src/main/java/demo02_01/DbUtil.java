package demo02_01;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.exceptions.ConnectionIsClosedException;

public class DbUtil {

	public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String DB_Url = "jdbc:mysql://localhost:3306/dmc";
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
	
	public static Connection connect() throws Exception{
		Connection con = DriverManager.getConnection(DB_Url, DB_user, DB_pass);
		return con;
	}
}
