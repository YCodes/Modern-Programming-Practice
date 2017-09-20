package lesson4.labs.partC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	List<Order> orderlist;
	
	Commissioned(double baseSalary, List<Order> orderlist){
		this.baseSalary = baseSalary;
		this.orderlist = orderlist;
		orderlist = new ArrayList<Order>();
	}
	
	double calcGrossPay(){
		
		return baseSalary+commission;
		
	}
	
	public Paycheck calcCompensation(int month, int year){
		int orderAmount = 0;
		for(Order o : orderlist){
			System.out.println(o);
			orderAmount += o.getOrderAmount();
		}
		this.commission = orderAmount;
		Paycheck paycheck  = new Paycheck(this.calcGrossPay());
		return paycheck;
		
	}
	
//	public void addOrder(Order newOrder){
//		orderlist.add(newOrder);
//	}
}
