package mockBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<book> book = new ArrayList<>();
		List<member> member = new ArrayList<>();
		List<issue> issue = new ArrayList<>();
		book.stream().forEach(System.out :: println );
		
		book.stream().sorted((e1,e2) -> e1.b_id - e2.b_id ).forEachOrdered(null);
		System.out.println("Enter VAlue");
		System.out.println("1. Add Book\r\n"
				+ "2. Add Member\r\n"
				+ "3. Issue Book\r\n"
				+ "4. Display Books\r\n"
				+ "5. Display Members\r\n"
				+ "6. View Books by Member Name\r\n"
				+ "0. Exit");
		
	
		int c = sc.nextInt();
		
		
		
		while(c != 0 ) {
			switch(c){
			case 1 : 
				book b = new book();
				b.accept(sc);
				book.add(b);
				break;
			case 2 :
				member m = new member();
				m.accept(sc);
				member.add(m);
				break;
			case 3 :
				issue i = new issue();
				i.accept(sc);
				
				for (book bb : book) {
					if(bb.getB_id() == i.b_id ) {
					for (member mm : member) {
						if( mm.m_id == i.m_id) {
							 issue.add(i);
			                    System.out.println("Issue Successful ✅");
			                   
			                    break;
					}
					}
				}
					}
				
				break;
			case 4:
				if(book.isEmpty()) {
					System.out.println("Information not Stored ");
				}else {
					for (book bb1 : book) {
						System.out.println(bb1.toString());
					}
				}
				break;
			case 5 :
					if(member.isEmpty()) {
						System.out.println("Info not Stored ");
					}
					else {
						for (member mm1 : member) {
							System.out.println(mm1.toString());
						}
					}
				break;
				
			case 6 :
				for (issue i2 : issue) {	
				for (book bb2 : book) {
					if(bb2.getB_id() == i2.getB_id()) {
					for (member mm2 : member) {
						if(i2.m_id == mm2.m_id) {
							System.out.println("Book Name IS "+ bb2.getTitle() + ", Member Name IS "+ mm2.getName());
						}
					}
					}
				}
				}
				break;
			default: 
				System.out.println("Invalid value");
				break;
				
			}
			System.out.println("Enter Value");
			System.out.println("1. Add Book\r\n"
					+ "2. Add Member\r\n"
					+ "3. Issue Book\r\n"
					+ "4. Display Books\r\n"
					+ "5. Display Members\r\n"
					+ "6. View Books by Member Name\r\n"
					+ "0. Exit");
			
			c = sc.nextInt();
		}
		}

	
}
