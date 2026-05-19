package book;

import java.util.List;
import java.util.Scanner;

import User.UserDao;
import User.UserDaoImpl;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		try(BookDao bookDao = new BookDaoImpl()){
			
//			System.out.println("Enter Book Id:");
//			int BookId = sc.nextInt();
//			Book book = bookDao.findById(BookId);
//			if(book == null) {
//				System.out.println("Book not Found ");
//			}
//				System.out.println("Found " + book);
//			
			System.out.println("Diaplay all info ");
			List<Book> bookList = bookDao.findall();
			for (Book book : bookList) {
				System.out.println(book);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
