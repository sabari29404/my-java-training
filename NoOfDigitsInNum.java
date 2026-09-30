package javaproblems;

public class NoOfDigitsInNum {
	public static void main(String[] args) {
		
		int num=12347890;
		int digit=0;
		
		while(num>0) {
			num=num/10;
			digit++;
		}
		System.out.println(digit);

	}

}
