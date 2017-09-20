package lesson10.labs.prob;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum {

	public static void main(String[] args) {
		System.out.println("Sum = "+sum(Arrays.asList(1.0,2.0,3.0,4.0)));
	}
	
	public static <T extends Number> double sum(List<T> list){
	    double sum = 0.0;
	    
	    for(T t: list){
	    	sum += t.doubleValue();
	    }	    
		return sum;
	}
}
