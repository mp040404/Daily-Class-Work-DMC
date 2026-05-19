package Association;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		student s = new student(1,"mohit",null);
//		s.DisplayStudent();
		student s = new student();
		s.setValue(sc);
		s.addp();
		s.DisplayStudent();
	}

}
