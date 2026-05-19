package com.example.demo;

public class AddmissionImpl implements Addmission{

	private int roll;
	private int std;
	private Student add;
	public AddmissionImpl() {
		// TODO Auto-generated constructor stub
	}
	public AddmissionImpl(int roll, int std, Student add) {
		super();
		this.roll = roll;
		this.std = std;
		this.add = add;
	}
	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}
	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}
	/**
	 * @return the std
	 */
	public int getStd() {
		return std;
	}
	/**
	 * @param std the std to set
	 */
	public void setStd(int std) {
		this.std = std;
	}
	/**
	 * @return the add
	 */
	public Student getAdd() {
		return add;
	}
	/**
	 * @param add the add to set
	 */
	public void setAdd(Student add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "AddmissionImpl [roll=" + roll + ", std=" + std + ", add=" + add + "]";
	}
	@Override
	public void SetRoll(int roll) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SetStd(int std) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SetAdd(Student add) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Student add() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
