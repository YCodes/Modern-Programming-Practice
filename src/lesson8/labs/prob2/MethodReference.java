package lesson8.labs.prob2;

import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> ab = Math::random;
		System.out.println(ab.get());
		
	}

}
