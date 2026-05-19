package com.mohit.day02;

public class Date {
	
	private int month;
	private int day;
	private int year;
	
	
	public Date() {
		day = 1;
		month = 1;
		year = 2000; 
			
	}
	public void setDate(int day,int month,int year) {
		this.day = day;
		this.month = month ;
		this.year = year ;
	}
	public void getData() {
		System.out.println(day + " / " + month + " / " + year);
	}
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.setDate( 9, 03, 2026);
		d1.getData();
	}

}
