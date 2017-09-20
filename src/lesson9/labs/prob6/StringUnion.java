package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringUnion {
	
	public Set<String> union(List<Set<String>> sets){
		return sets.stream().flatMap(n -> n.stream()).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> listOfSet = new ArrayList<Set<String>>();
		Set<String> first = new HashSet<String>();
		first.add("A");
		first.add("B");
		
		Set<String> second = new HashSet<String>();
		second.add("D");
		
		Set<String> third = new HashSet<String>();
		third.add("1");
		third.add("3");
		third.add("5");
		
		listOfSet.addAll(Arrays.asList(first,second,third));
		
		
		StringUnion obj = new StringUnion();
		Set<String> result = obj.union(listOfSet);
		result.stream().forEach(System.out::print);
	}

}
