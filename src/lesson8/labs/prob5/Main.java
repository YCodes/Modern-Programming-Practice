package lesson8.labs.prob5;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args){
		
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		System.out.println(" Using forEach with Lambdas");
		fruits.forEach(k -> System.out.println(k));
		
		System.out.println("\n Using forEach with Method Reference");
		fruits.forEach(System.out::println);
		
		
		System.out.println("\n Sorting by ignore case using Method Reference");		
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		// Arrays.sort(namesArr, (a,b) -> a.compareToIgnoreCase(b)); // Using Lambda
		Arrays.sort(names,String::compareToIgnoreCase);
		Arrays.stream(names).forEach(System.out::println);
	}

}
