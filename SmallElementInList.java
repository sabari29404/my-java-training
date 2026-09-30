package javaproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SmallElementInList {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(5,1,2,2,5,3,4);
		Set<Integer> tm=new TreeSet();
		
		for(int ele:l) {
			tm.add(ele);
		}
		System.out.println(((TreeSet) tm).getLast());
	}

}
