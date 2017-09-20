package lesson9.labs.prob2;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxMinInteger {

	public static void main(String[] args) {

		myMethod().max().ifPresent(max->System.out.println("Maximum value: " +max));
		
		myMethod().min().ifPresent(min->System.out.println("Minimum value: " +min));
	}
	
	public static IntStream myMethod(){
		return IntStream.of(1,4,5,3,8,2);
	}

}
