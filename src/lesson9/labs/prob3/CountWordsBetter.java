package lesson9.labs.prob3;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface QuadFunction<T,U,V,W,R>{
	R apply(T t, U u, V v, W w);
}


public class CountWordsBetter {
	
	public static final QuadFunction<List<String>, Character, Character, Integer, Integer> COUNT_WORDS = (words, a,b,c) -> (int) words.stream()
																															.filter(word -> word.length()==c)
																															.filter(inclChar -> inclChar.contains(Character.toString(a)))
																															.filter(exclChar -> !exclChar.contains(Character.toString(b)))
																															.count();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWords cw = new CountWords();
		List<String> wordList = Arrays.asList("Mango","Cherry","Pineapple","Orange","Grapes","Apple");
		int result = CountWordsBetter.COUNT_WORDS.apply(wordList, 'M', 'e' ,5);
		System.out.println("Result: " + result);
	}

}
