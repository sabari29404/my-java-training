package javaproblems;
import java.util.*;
public class SortList {
	public static void main(String[] args) {
		List<Character> l= Arrays.asList('z','b','f','d','a');
		//Collections.sort(l,Collections.reverseOrder());
		for(int i=0;i<l.size()-1;i++) {
			for(int j=0;j<l.size()-1;j++) {
				if(l.get(j)<l.get(j+1)) {
					char temp=l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, temp);
				}
			}
		}
		System.out.println(l);
	}

}
