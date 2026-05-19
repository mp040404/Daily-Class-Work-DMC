package Upcasting;

import java.util.Scanner;

public class main {

		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			person e = null;
			e = new student();
			e.setValue(sc);
			e.getValue();
		
		}
}
