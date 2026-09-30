package javaproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {
	public static void main(String[] args) {
		
		String str="encyclopidia is big";
		
		LinkedHashMap<Character, Integer> hm=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		System.out.println(hm.get('o'));
		for(Map.Entry<Character,Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
