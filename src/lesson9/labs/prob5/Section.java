package lesson9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
	
	public static Stream<String> streamSection(Stream<String> stream, int m, int n){
		return stream.skip(m).limit(n-m);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> ab = streamSection(nextStream(), 2, 8);
		System.out.println(ab.collect(Collectors.toList()));
		
		Stream<String> names = Stream.of("Harry","Matt","Susan","Christy","Emannuel");
		Stream<String> abc = streamSection(names, 0,3);
		System.out.println(abc.collect(Collectors.toList()));
		
		String[] states = {"Iowa","Chicago","New York","California"};
		Stream<String> abcd = streamSection(Arrays.asList(states).stream(), 1,4);
		System.out.println(abcd.collect(Collectors.toList()));
		
		Stream<String>  abcde= streamSection(Arrays.stream(states), 1,4);
		System.out.println(abcde.collect(Collectors.toList()));
	}
	
	private static Stream<String> nextStream(){
		return Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii").stream();
	}

}
