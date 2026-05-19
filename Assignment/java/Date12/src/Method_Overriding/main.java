package Method_Overriding;

import java.util.Scanner;

public class main {

		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			person p;
			student s ;
			project s1 ;
			p = new person();
			s = new student();
			s1 = new project();
			
			p.setValue(sc);
			p.getValue();
			s.setValue(sc);
			s.getValue();
			s1.setValue(sc);
			s1.getValue();
		}
}
