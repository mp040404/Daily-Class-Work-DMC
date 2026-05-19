package generic_class;

public class gc_ub<T>  {
T data ;
	
	public gc_ub() {
		// TODO Auto-generated constructor stub
	}
	
	public gc_ub(T data) {
		super();
		this.data = data;
	}

	
	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
	public void print(<?> b) {
		Object obj = b.get();
		 System.out.println("Box contains: " + obj);
	}
	

	
	public static void main(String[] args) {

		gc_ub<String> sb = new gc_ub<String>("DAC");
	}

}
