package lesson9.labs.prob3;

import java.util.Arrays;
import java.util.List;

public class CountWords {
	
	public int countWords(List<String> words, char c, char d, int len){
		long ab = words.stream()
				.filter(a -> a.length()==len)
				.filter(a -> a.contains(Character.toString(c)))
				.filter(b -> !b.contains(Character.toString(d))).count();
		return (int)ab;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWords cw = new CountWords();
		List<String> wordList = Arrays.asList("Mango","Cherry","Pineapple","Orange","Grapes","Mapes","Apple");
		int result = cw.countWords(wordList, 'M', 'e' ,5);
		System.out.println("Result: " + result);
	}

}
