package Person;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate dateHired;
	
	@Override
	public String toString() {
		return "Employee [office=" + office + ", salary=" + salary
				+ ", dateHired=" + dateHired + "]";
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}


	
	
	

}
