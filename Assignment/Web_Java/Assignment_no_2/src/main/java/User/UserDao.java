package User;

import java.util.List;

public interface UserDao extends  AutoCloseable  {
	
	User findById(int userId) throws Exception;
	List<User> findAll() throws Exception ;
	User findByEmail(String email) throws Exception ;
	int save(User user) throws Exception ;
	
	
}
