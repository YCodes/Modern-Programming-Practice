package lesson4.labs.partC;

public class Salaried extends Employee {
	private double salary;
	
	Salaried(double salary){
		this.salary = salary;
	}
	
	double calcGrossPay(){
		return salary;
	}
	
//	public Paycheck calcCompensation(){
//		return new Paycheck(calcGrossPay());
//	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
