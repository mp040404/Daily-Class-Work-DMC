package User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements AutoCloseable , UserDao {

	private Connection con;
	public UserDaoImpl() throws Exception {
		con = DbUtil.connect();
	}
	@Override
	public void close() throws Exception {
		
	}
	@Override
	public User findById(int userId) throws Exception {
		String sql = "SELECT * FROM users Where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, userId);
		try(ResultSet rs = stmt.executeQuery()){
				if(rs.next()) {
					String name = rs.getString("name");
					String email = rs.getString("email");
					String pass = rs.getString("password");
					Date birth = rs.getDate("birth");
					String addr = rs.getString("addr");
					User user = new User(userId,name,pass,email,addr, birth);
					return user;
				}
			}
		}
		return null;
	}
	
	@Override
	public List<User> findAll() throws Exception {
		String sql = "Select * From users";
		List<User> list = new ArrayList<>();
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email = rs.getString("email");
					String pass = rs.getString("password");
					Date birth = rs.getDate("birth");
					String addr = rs.getString("addr");
					User user = new User(id,name,pass,email,addr, birth);
					list.add(user);
				}
			}
		}
		return list;
	}
	
	@Override
	public User findByEmail(String email) throws Exception {
			
			String sql = "Select * from users where email = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setString(1, email);
				try(ResultSet rs = stmt.executeQuery()){
					if(rs.next()) {
						String useremail = rs.getString("email");
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String pass = rs.getString("password");
						Date birth = rs.getDate("birth");
						String addr = rs.getString("addr");
						User user = new User(id, name, pass, useremail, addr, birth);
						return user;
					}
				}
			}
		return null;
	}
	
	@Override
	public int save(User user) throws Exception {
		String sql = "INSERT INTO users (name, password, email, birth, addr) VALUES (?,?,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1,user.getName());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getAddr());
			stmt.setDate(5, user.getBirth());
			int count = stmt.executeUpdate();
			return count ;
		}
		
	}
}
