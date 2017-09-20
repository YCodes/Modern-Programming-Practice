package lesson10.labs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.addAll(Arrays.asList(5,4,7,8,1,3,9));
		System.out.println(secondSmallest(intValues));
		
		List<String> strValues = new ArrayList<String>();
		strValues.addAll(Arrays.asList("a","ac","b","red"));
		System.out.println(secondSmallest(strValues));
		
	}
	
	public static <T> T secondSmallest(List<T> list){
		List<T> result = list.stream().sorted().collect(Collectors.toList());
		return result.get(1);
	}

}
