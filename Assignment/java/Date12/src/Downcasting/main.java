package Downcasting;

import java.util.Scanner;

public class main {

		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			person e ;
			e = new project();
			student s = (student) e ; ;
			s.setValue(sc);
			s.getValue();
			s.calculatTotalMarks();
		
		}
}
