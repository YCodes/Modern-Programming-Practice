package lesson9.labs.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> names = Stream.of("Bill","Thomas","Mary");
		System.out.println(names.collect(Collectors.joining(",")));
	}

}
