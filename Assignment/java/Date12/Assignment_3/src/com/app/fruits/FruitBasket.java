package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basket Size : ");
		int size = sc.nextInt();
	1	fruit r = new fruit();
		
		fruit[] f=new fruit[size];
		int counter = 0;
		
		int choice ;
		
		do {
			System.out.println("\n0.Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display name of all fruit in the basket.");
			System.out.println("5. Display name,color,weight ,\n "
					+ 		   "   taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh)"
					+          "   fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("Enter Choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
					System.out.println("Enter Mango Details : ");
					System.out.println("name, color , weight : ");
					if(counter < size) {
						f[counter++] = new mango(sc.next(),sc.next(),sc.nextDouble());
					}else {
						System.out.println("Basket is Full ... !");
					}
					break;
			case 2 : 
					System.out.println("Enter Orange Details : ");
					System.out.println("name, color , weight : ");
					if(counter < size) {
						f[counter++] = new orange(sc.next(),sc.next(),sc.nextDouble());
					}else {
						System.out.println("Basket is Full ... !");
					}
					break;
			case 3 :
					System.out.println("Enter Apple Details ");
					System.out.println("name  , weight , color : ");
					if(counter < size) {
					f[counter ++] = new apple(sc.next(),sc.next(),sc.nextDouble());
					}else {
						System.out.println("Basket is Full ... !");
					}
					break;
			case 4 : 
					System.out.println("name of all fruit in the basket");
					 for(fruit e : f) {
		                    if(e != null)
		                        System.out.println(e.getName());
		                }
		                break;
			case 5 : 
					System.out.println("Details of all fresh fruits , in the basket.");
					for(fruit e : f ) {
						if(e != null)
							System.out.println(e.toString());
							System.out.println(e.taste());
					}
					break ;
			case 6 : 
						for(fruit e:f) {
							if(f != null  && !e.isIsfresh()) {
								 System.out.println(e.getName()+e.taste());
							}
						}
					break;
//					for(fruit e:f) {
//						if(f != null && !e.isIsfresh()) {
//							System.out.println(e.getName()+e.isfresh());
//						}
//					}
			case 7 : 
						int index = sc.nextInt();
		                if(index >= 0 && index < counter) {
		                	f[index].setIsfresh(false);
		                	System.out.println("set index");
		                } else {
		                    System.out.println("Invalid index");
		                }
					
			}
		}while(choice != 0);
		
		
		

	}

}
