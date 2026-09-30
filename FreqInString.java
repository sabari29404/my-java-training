package javaproblems;

import java.util.HashMap;
import java.util.Map;

public class FreqInString {

	public static void main(String[] args) {
		
		String s="Hello world hai".toLowerCase().replaceAll(" ", "");
		Map<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			hm.put(s.charAt(i), (hm.getOrDefault(s.charAt(i), 0))+1);
		}
		
		System.out.println(hm);

	}

}
