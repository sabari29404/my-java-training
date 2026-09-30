package javaproblems;

public class ArrToStr {
	public static void main(String[] args) {
		
		char[] arr= {'h','e','l','l','o'};
		StringBuffer sb=new StringBuffer();
		for(char ch:arr) {
			sb.append(ch);
		}
		
		System.out.println(sb);
	}

}
