package q_2;

public class linearSearch {
	
	public static void main(String[] args) {
		
		int key = 4;
		int count =0;
		int arr[] = {1,2,3,4,4,4,5,4,6};
		
		for(int i= 0 ; i< arr.length ; i++) {
			if(arr[i] == key) {
				System.out.println("Found value is " +arr[i] + " & Index Comparisons is : "+i);
				
				count ++;
			}
		}
		System.out.println("no of Comparisons :  "+count);
		
	}

}
