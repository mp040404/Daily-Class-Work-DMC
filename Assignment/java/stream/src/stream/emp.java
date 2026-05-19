package stream;

import java.util.Objects;
import java.util.Scanner;

public class emp {
	int id;
	String name;
	double salary;
	 
	public emp() {
		// TODO Auto-generated constructor stub
	}

	public emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof emp))
			return false;
		emp other = (emp) obj;
		return id == other.id;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Emp id : ");
		id = sc.nextInt();
		System.out.println("Enter Emp Name : ");
		name = sc.next();
		System.out.println("Enter Emp Salary : ");
		salary = sc.nextDouble();
	}

}
