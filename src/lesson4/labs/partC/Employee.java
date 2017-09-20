package lesson4.labs.partC;

public abstract class Employee {
	private int empId;
	

	public void print(){
		System.out.println(this.empId);
		
	}
	
	public Paycheck calcCompensation(int month, int year){
		
		return new Paycheck(calcGrossPay());
		
	}
	
	abstract double calcGrossPay();

}
