package generic_class;

public class gc_bounded<T extends Number> {
	T data ;
	
	public gc_bounded() {
		// TODO Auto-generated constructor stub
	}
	
	public gc_bounded(T data) {
		super();
		this.data = data;
	}

	
	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public static void main(String[] args) {
		gc_bounded<Integer> g = new gc_bounded<Integer>();
		g.setData(15);
		
//		gc_bounded<String> g1= new gc_bounded<String>();// not ok
		
		System.out.println(g.getData());
		
	}

}
