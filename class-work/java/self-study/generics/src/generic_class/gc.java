package generic_class;

public class gc<T> {
	T data ; 
	
	public gc() {
		// TODO Auto-generated constructor stub
	}

	public gc(T data) {
		super();
		this.data = data;
	}
	
	public void setValue(T data) {
		this.data = data ;
	}
	



	public T getData() {
		return data;
	}

public static void main(String[] args) {

	gc<Integer> g = new gc<Integer>(); 
	g.setValue(10);
	
	gc<String> g1 = new gc<String>();
	g1.setValue("Sunbeam");
	
	gc<Double> g2 = new gc<Double>();
	g2.setValue(12.03);
	
	System.out.println(g.getData());
	System.out.println(g1.getData());
	System.out.println(g2.getData());
	 
	
	}
}