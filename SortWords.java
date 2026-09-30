package javaproblems;
import java.util.*;
public class SortWords {
	public static void main(String[] args) {
		
		String sentence="Hi my name is sabari";
		
		List l=Arrays.asList(sentence.split("\\s+"));
		
		Collections.sort(l);
		
		for(Object word: l) {
			System.out.println(word);
		}
		
	}

}
