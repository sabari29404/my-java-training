package javaproblems;

import java.util.ArrayList;
import java.util.List;

public class SeperateCharAndInt {
	public static void main(String[] args) {
		
		String sentence="Hello 123 i am 444 hell4";
		
		List<String> digit=new ArrayList<>();
		List<String> string=new ArrayList<>();
		String[] arr=new String[10];
		
		arr=sentence.split("\\s");
		
		/*for(String i:arr) {
			if(Character.isLetter(i.charAt(0))) {
				string.add(i);
			}
			else {
				digit.add(i);
			}
		}*/
		
		for(String i:arr) {
			if (i.matches("[a-zA-Z]+")) string.add(i);
			if (i.matches("\\d+")) digit.add(i);

		}
		
		
		System.out.println(digit);
		System.out.println(string);
		
		boolean r="".matches("[a-zA-Z]+");
		boolean s="".matches("\\d+");
		System.out.println(r+" "+s);

	}

}
