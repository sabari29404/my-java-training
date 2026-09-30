package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToStr {
 static void main(String[] args) {
		
	 ArrayList<String> al=new ArrayList<>(Arrays.asList("hello","my","name","is","sab"));
	 String sentence="";
	 
	 for(String word:al) {
		 sentence=sentence+" "+word;
	 }
	 System.out.println(sentence);
	}

}
