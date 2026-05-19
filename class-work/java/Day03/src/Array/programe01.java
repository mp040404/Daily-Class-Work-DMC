package Array;

import java.util.Scanner;

public class programe01 {

	
	public static  void main(String[] args) {
		//this is 1 D Array
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
//		arr[0] = 1 ;
//		arr[1] = 2 ;
//		arr[2] = 3 ;
//		arr[3] = 4 ;
//		arr[4] = 5 ;
//		for(int e : arr)
//			System.out.println(e);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number "+(i+1)+" :");				
         arr[i] = sc.nextInt(); 
        }
		
		for(int e : arr)
			System.out.print(e+" ");
	}
}
