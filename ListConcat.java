package javaproblems;
import java.util.*;
public class ListConcat {
	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> l2=new ArrayList<>(Arrays.asList(6,7,8,9,10));
		List<Integer> result=new ArrayList<>();
		
		boolean isAddl1=l1.addAll(l2);
		
		//System.out.println(l2);
		

	}

}
