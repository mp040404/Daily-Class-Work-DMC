package Variable_Arity_Argument_Method;

public class program {

	public static void add(int... arr) {
		int total = 0 ;
		for(int num:arr)
		{
			total = total + num;
			
		}
		System.out.println(" Addition is : "+total);
	}
	public static void main(String[] args) {
		add(10,10);
	}
}
