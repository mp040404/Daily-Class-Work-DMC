package q_1;

public class LinearScearch {
	
	public static void main(String[] args) {
		int key = 4;
		int lastndex = -1 ;
		int arr[] = {1,2,3,4,4,4,5,4,6};
		for(int i = arr.length-1 ; i >= 0 ; i--)

		{
			if(arr[i] == key) {
				lastndex = i ;
				break;
			}
		}
		if(lastndex != -1) {
			System.out.println(lastndex);
		}
		else {
			System.out.println("not Found !");
		}
	}

}
