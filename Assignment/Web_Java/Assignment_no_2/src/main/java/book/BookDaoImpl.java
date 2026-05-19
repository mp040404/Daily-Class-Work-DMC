package book;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements AutoCloseable , BookDao {

private Connection con;
	
	public BookDaoImpl() throws Exception {
		con = DbUtil.connect();
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Book findById(int bookId) throws Exception {
			String sql = "Select * from books where id = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)){
				stmt.setInt(1, bookId);
			try(ResultSet rs = stmt.executeQuery()){
				if(rs.next()) {
					String name = rs.getString("name");
					String auth = rs.getString("author");
					String sub = rs.getString("subject");
					Double price = rs.getDouble("price");
					
					Book book = new Book(bookId,name,auth,sub,price);
					return book;
				}
			}
			}
		return null;
	}
	
	@Override
	public List<Book> findall() throws Exception {
	    String sql = "SELECT * FROM books";
	    List<Book> list = new ArrayList<>();

	    try (PreparedStatement stmt = con.prepareStatement(sql)) {
	        try (ResultSet rs = stmt.executeQuery()) {

	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String auth = rs.getString("author");
	                String sub = rs.getString("subject");
	                double price = rs.getDouble("price");

	                Book book = new Book(id, name, auth, sub, price);
	                list.add(book);
	            }
	        }
	    }
	    return list;
	}
}
