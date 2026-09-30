package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> l2=new ArrayList<>(Arrays.asList(3,4,5,6,7));
		List<Integer> Intersection=new ArrayList<>();
		
		for(int i:l1) {
			if(l2.contains(i)){
				Intersection.add(i);
			}
		}
		
		l1.retainAll(l2);
		
		System.out.println(l1);
	}

}
