package lesson8.labs.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Double, Double, List<Double>> ab = (x,y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x*y);
			return list;
		};
		
		List<Double> result = ab.apply(2.0, 3.0);
		System.out.println(result);
	}

}
