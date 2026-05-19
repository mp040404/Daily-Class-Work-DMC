

import java.util.Scanner;

import com.app.fruits.apple;
import com.app.fruits.fruit;
import com.app.fruits.mango;
import com.app.fruits.orange;

public class FruitBasket {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basket Size");
        int size = sc.nextInt();

        fruit basket[] = new fruit[size];
        int counter = 0;

        int choice;

        do {
            System.out.println("\n0.Exit");
            System.out.println("1.Add Mango");
            System.out.println("2.Add Orange");
            System.out.println("3.Add Apple");
            System.out.println("4.Display fruit names");
            System.out.println("5.Display fresh fruits details");
            System.out.println("6.Display stale fruits taste");
            System.out.println("7.Mark fruit stale");

            choice = sc.nextInt();

            switch (choice) {

            case 1:
                if(counter < size) {
                    System.out.println("Enter name weight color");
                    basket[counter++] =
                        new mango(sc.next(), sc.next(), sc.nextDouble());
                } else {
                    System.out.println("Basket full");
                }
                break;

            case 2:
                if(counter < size) {
                    System.out.println("Enter name weight color");
                    basket[counter++] =
                        new orange(sc.next(), sc.next(), sc.nextDouble());
                } else {
                    System.out.println("Basket full");
                }
                break;

            case 3:
                if(counter < size) {
                    System.out.println("Enter name weight color");
                    basket[counter++] =
                        new apple(sc.next(), sc.next(), sc.nextDouble());
                } else {
                    System.out.println("Basket full");
                }
                break;

            case 4:
                for(fruit f : basket) {
                    if(f != null)
                        System.out.println(f.getname());
                }
                break;

            case 5:
                for(fruit f : basket) {
                    if(f != null && f.isfresh()) {
                        System.out.println(f);
                        System.out.println("Taste : " + f.taste());
                    }
                }
                break;

            case 6:
                for(fruit f : basket) {
                    if(f != null && !f.isfresh()) {
                        System.out.println(f.taste());
                    }
                }
                break;

            case 7:
                System.out.println("Enter index");
                int index = sc.nextInt();

                if(index >= 0 && index < counter) {
                    basket[index].setIsfresh(false);
                } else {
                    System.out.println("Invalid index");
                }
                break;

            }

        } while(choice != 0);

        sc.close();
	}

}
