package javaproblems;

import java.util.Arrays;
import java.util.List;

public class MostFrequentElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,2,1,2,2,1,1,4,5,6);
		int maxCount=0;
		int mostFreq=0;
		for(int i=0;i<list.size();i++) {
			int count=0;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
					//System.out.println(count);
				}
			}
			if(count>=maxCount) {
				maxCount=count;
				mostFreq=list.get(i);
			}
		}
		System.out.println(mostFreq);
	}

}
