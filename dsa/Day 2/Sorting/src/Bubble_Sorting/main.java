package Bubble_Sorting;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
//		int arr[] = { 30,20,60,50,10,40 } ;
		int arr[] = { 11,22,33,44,55,66 } ;
 		System.out.println("Array before sort : " + Arrays.toString(arr));
		efficientBubbleSort(arr,arr.length);
		System.out.println("Array After Sort : " + Arrays.toString(arr));
		
		
	}

	private static void efficientBubbleSort(int[] arr, int n) {
		
		int itr = 0 , comp = 0 ,flag = 0;
		for(int i = 1 ; i < n ; i++ ) {
			itr++;
			for(int j = 0; j < n-i ; j++) {
				comp++;
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					flag++ ;
				}
			}
			if (flag == 0 )
				break;
		}
		
		System.out.println("itr = "+itr+" comp = "+comp);
		
	}

}
