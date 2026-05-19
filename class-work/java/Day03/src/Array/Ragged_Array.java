package Array;

import java.util.Scanner;

public class Ragged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m , n  ;
		System.out.println("Enter First index of array");
		n = sc.nextInt();
		System.out.println("Enter Second index of array");
		m = sc.nextInt();
		
		int[][] arr=new int[n][m];
		

		for (int i = 0; i < arr.length; i++) {
 		for (int j = 0; j < arr[i].length; j++) {
 			System.out.println("Enter Number "+(i+1)+(j+1)+" :");				
 				arr[i][j] = sc.nextInt(); 
         }
        }
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
			 System.out.print(arr[i][j] + " ");
			 }
			
			System.out.println(" ");
			}
		

	}

}
