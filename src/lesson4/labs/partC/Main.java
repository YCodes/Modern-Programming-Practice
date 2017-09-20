package lesson4.labs.partC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.now();
		Employee e1 = new Hourly(10, 30.0);
		Employee e2 = new Salaried(3000);
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1, ld , 120));
		orders.add(new Order(2, ld , 130));
		
		Employee e3 = new Commissioned(5000, orders);
//		System.out.println(orders);
		
		System.out.println("Hourly Employee - Net Pay : " + e1.calcCompensation(6, 2017).getNetPay());
		System.out.println("Salaried Employee - Net Pay : " + e2.calcCompensation(6, 2017).getNetPay());
		System.out.println("Commissioned Employee - Net Pay : " + e3.calcCompensation(6, 2017).getNetPay());
	}

}
