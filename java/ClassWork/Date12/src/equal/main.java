package equal;

import java.util.Scanner;

public class main {

		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			student s =new student();
			s.setValue(sc);
			student s1 =new student();
			s1.setValue(sc);
			
			if(s.equals(s1)) {
				System.err.println("Marks are same");
			}else {
			System.out.println("Marks are not same");
			}
		
		}
}
