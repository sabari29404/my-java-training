package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanOfList {
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>(Arrays.asList(19,21,46,11,18));
		int sum=0;
		
		for(int ele:l1) {
			sum+=ele;
		}
		double mean=sum/l1.size();
		System.out.println("Mean: "+mean);
	}

}
