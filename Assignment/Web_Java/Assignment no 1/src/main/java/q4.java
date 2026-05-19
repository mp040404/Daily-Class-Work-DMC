import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class q4 {
	
		public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
		public static final String DB_URL = "jdbc:mysql://localhost:3306/dmc";
		public static final String DB_user = "mohit";
		public static final String DB_pass = "mohit" ;
		
		static {
			try {
				Class.forName(DB_Driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id you Wan't Delete :");
		int id = sc.nextInt();
//		Delete user with given id.
		try(Connection con=DriverManager.getConnection(DB_URL,DB_user,DB_pass)){
			
		try(Statement stmt = con.createStatement()){
			String sql = String.format("DELETE FROM users WHERE id = %d", id);
				System.out.println("Sql : "+sql);
				int count = stmt.executeUpdate(sql);
				System.out.println("Rows Deleted : " + count);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
