package lesson4.labs.partC;

public class Hourly extends Employee {
	
	private double hourlyWage;
	private double hoursPerWeek;
	
	Hourly(double hourlyWage, double hoursPerWeek){
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	double calcGrossPay(){
		return hourlyWage * hoursPerWeek * 4; // Caculating for months
	}

	
//	public Paycheck calcCompensation(){
//		return new Paycheck(calcGrossPay());
//	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	

}
