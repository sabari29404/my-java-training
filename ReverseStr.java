package javaproblems;

public class ReverseStr {
	public static void main(String[] args) {
		
		String word="hello world";
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}

	}

}
