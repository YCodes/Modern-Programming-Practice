package lesson8.labs.prob2;

import java.util.function.Supplier;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> ob = ()->Math.random();
		double result = ob.get();
		
		System.out.println(result);

	}

}
