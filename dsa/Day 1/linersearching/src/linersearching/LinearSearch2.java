package linersearching;

import java.util.Scanner;

public class LinearSearch2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int arr[] = {11,25,34,66,99,100,55,12};
		
		System.out.println("Enter number you found it");
		int key = sc.nextInt();
		
		int i = LinearSearch(arr,arr.length,key);
		
		if(i == -1) {
			System.out.println("Not Found ... ! " );
		}
		else {
			System.out.println("Found ");
		}
			
	}

	private static int LinearSearch(int[] arr, int n, int key) {
		for(int i = 0 ; i < n ; i ++) {
			if (key == arr[i] )
				return 1;
		}
		return 0;
	}

}