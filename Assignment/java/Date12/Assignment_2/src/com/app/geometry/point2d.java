package com.app.geometry;

public class point2d {

		private double x ;
		private double y ;

//	public point2d(){
//		}
	public point2d(int x,int y){
		this.x = x;
		this.y = y;
	}

//	public String getDetails() {
//		return "Point coordinates : (" + x + y + " )";
//		
//	}
	public Boolean isEqual(point2d m) {
		return this.x == m.x && this.y == m.y ; 
	}
	 public double calculate(point2d m) {
	        return Math.sqrt(Math.pow(m.x - this.x, 2) + Math.pow(m.y - this.y, 2));
	}
    public static void main(String[] args) {
    	point2d p=new point2d(1,1);
    	point2d p1=new point2d(6,6);
    	if(p.isEqual(p1)) {
    		System.out.println("Enter Value is Same....! ");
    	}
    	else {
    		
    		System.out.println("distance:"+p.calculate(p1));
    		
    	}

    }
}
