package lesson10.labs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	public static void reverse(List<?> list){
		
		reverseHelper(list);
		System.out.println(list);
	}
	
	public static <T> List<T> reverseHelper(List<T> list){
//		List result = new ArrayList<>();
//		for(int i=list.size()-1; i>=0; i-- ){
//			result.add(list.get(i));
//		}
//		System.out.println(result);
		
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List List1 = new ArrayList<String>();
		List1.addAll(Arrays.asList("Java","MPP","SE"));
		reverse(List1);
		
		List List2 = new ArrayList<Integer>();
		List2.addAll(Arrays.asList(4,5,6));
		reverse(List2);
		
		List List3 = new ArrayList<Character>();
		List3.addAll(Arrays.asList('c','d','e'));
		reverse(List3);
	}

}
