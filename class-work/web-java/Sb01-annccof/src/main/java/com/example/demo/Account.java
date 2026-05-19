package com.example.demo;

public interface Account {
	
	void SetId(int id);
	void SetType(String type);
	void SetBalance(double balance);
	void SetAcc(Person accH);
	int getId();
	String getType();
	double getBalance();
	Person getAcc();
	void deposit(double amount);
	void withdraw(double amount);
	

}
