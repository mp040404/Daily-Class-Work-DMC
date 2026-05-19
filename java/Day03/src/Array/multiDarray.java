package Array;

import java.util.Scanner;

public class multiDarray {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr=new int[2][2];

		for (int i = 0; i < arr.length; i++) {
 		for (int j = 0; j < arr[i].length; j++) {
 			System.out.println("Enter Number "+(i+1)+(j+1)+" :");				
 				arr[i][j] = sc.nextInt(); 
         }
        }
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			 System.out.println(arr[i][j] + ", ");
			 }
			}
	}
}
