package demo02_01;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class JdbcDemo02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try(UserDao userDao = new UserDaoImpl()){
			System.out.println("1. find User ");
			System.out.println("2. Display all Elements");
			System.out.println("3. find User with email");
			System.out.println("4. Insert User");
			System.out.println("0. Exit");
			int c = sc.nextInt();
		while(c != 0 ) {
			
			switch(c) {
			case 1:
				System.out.println("Find User With User Id");
				
					
					System.out.println("Enter User Id: ");
					int userId = sc.nextInt();
					User user = userDao.findById(userId);
					if(user == null)
						System.out.println("User not found");
					else
						System.out.println("Found " + user);
					
				
				break;
			case 2 :
				System.out.println("Display all info ");
				
					List<User> userList = userDao.findAll();
					for(User user1 : userList) {
						System.out.println(user1);
					}
				break;
			case 3 :
				System.out.println("Find With email id ");
				String email = sc.next();
				User user1 = userDao.findByEmail(email);
				if(user1 == null)
					System.out.println("User not found");
				else
					System.out.println("Found "+user1);
				break;
			case 4 :
				System.out.println("Insert User");
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter Passwd: ");
				String passwd = sc.next();
				System.out.print("Enter Email: ");
				String email1 = sc.next();
				System.out.print("Enter Birth (yyyy-MM-dd): ");
				String birthStr = sc.next();
				System.out.print("Enter Address: ");
				String addr = sc.next();
				
				
				Date birth = Date.valueOf(birthStr);
				User user11 = new User( 0,name, passwd, email1, addr, birth);
				int count = userDao.save(user11);
				System.out.println("User Inserted: " + count);

				break;
			default:
				System.out.println("Enter invalid Value");
				break;
			}
			System.out.println("1. find User with id ");
			System.out.println("2. Display all Elements");
			System.out.println("3. find User with email");
			System.out.println("4. Insert User");
			System.out.println("0. Exit");
			c = sc.nextInt();
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
