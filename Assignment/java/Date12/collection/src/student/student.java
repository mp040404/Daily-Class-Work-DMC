package student;

import java.util.Objects;



public class student implements Comparable<student>{
	int roll_no ;
	String name;
	Double marks;
	
	public student() {
	}

	public student(int roll, String name, Double marks) {
		super();
		this.roll_no = roll;
		this.name = name;
		this.marks = marks;
	}
	
	



	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll_no);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof student))
			return false;
		student other = (student) obj;
		return Objects.equals(marks, other.marks) || Objects.equals(name, other.name) || roll_no == other.roll_no;
	}
	
	
	@Override
	public String toString() {
		return "student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(student o) {
		
		return this.roll_no - o.roll_no;
	}
	
	public double CalculatePercentage() {
		double per = (marks / 200) * 100 ;
		return per;
	}

}
