package book;

import java.util.List;
import java.sql.PreparedStatement;

public interface BookDao extends AutoCloseable {
	
	 Book findById(int bookId) throws Exception ;
	 List<Book> findall() throws Exception;
	 
}
