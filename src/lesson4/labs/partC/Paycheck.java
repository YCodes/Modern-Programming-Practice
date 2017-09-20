package lesson4.labs.partC;

public final class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double ssn;
	
//	Paycheck(){
//		fica = 0.23;
//		state = 0.05;
//		local = 0.01;
//		medicare = 0.03;
//		ssn = 0.075;
//	}
	
	public Paycheck(double grossPay){
		fica = 0.23;
		state = 0.05;
		local = 0.01;
		medicare = 0.03;
		ssn = 0.075;
		this.grossPay = grossPay;
	}
	
	public void print(){
		System.out.println("Net Pay: " + getNetPay() + " Gross Pay: " + getGrossPay());
	}
	
	public double getNetPay(){
		double netPay = grossPay - (fica*grossPay + state*grossPay + local*grossPay + medicare*grossPay + ssn*grossPay);
		return netPay;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSsn() {
		return ssn;
	}
	

}
