package com.example.demo;

public class AccountImpl implements Account {
	private int id;
	private String type;
	private double balance;
	private Person accH ;
	
	public AccountImpl() {
		// TODO Auto-generated constructor stub
	}

	public AccountImpl(int id, String type, double balance, Person accH) {
		super();
		this.id = id;
		this.type = type;
		this.balance = balance;
		this.accH = accH;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccH() {
		return accH;
	}

	public void setAccH(Person accH) {
		this.accH = accH;
	}

	@Override
	public void SetId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetType(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetBalance(double balance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetAcc(Person accH) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getAcc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deposit(double amount) {
		this.balance = this.balance + amount;	
	}

	@Override
	public void withdraw(double amount) {
		this.balance = this.balance - amount;	
	}

	@Override
	public String toString() {
		return "AccountImpl [id=" + id + ", type=" + type + ", balance=" + balance + ", accH=" + accH + "]";
	}
	

}
