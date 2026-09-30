package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		List<String> al=Arrays.asList("a","b","b","c","c","a","d","f","g");
		Set hs=new HashSet();
		for(String ele:al) {
			hs.add(ele);
		}
		System.out.println(hs);
	}

}
