package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToString {

	public static void main(String[] args) {
		
		List<Character> l1=new ArrayList<>(Arrays.asList('a','b','c','d','e'));
		StringBuilder sb=new StringBuilder();
		
		for(char ele:l1) {
			sb.append(ele+"");
		}
		
		System.out.println(sb);

	}

}
