
public class employee {

	int id; 
	String name;
	double basic_salary;
	boolean isActive;
	
	public employee() {
	}

	public employee(int id, String name, double basic_salary, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.basic_salary = basic_salary;
		this.isActive = true;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBasicSalary() {
	    return basic_salary;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean activeStatus) {
	    this.isActive = activeStatus;
	}

	
	public double computeNetSalary() {
		return basic_salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", basic_salary=" + basic_salary + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	
}
