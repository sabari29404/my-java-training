package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumElementsInList {
	public static void main(String[] args) {
		int sum=0;
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		for(int i:al) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
