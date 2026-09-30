package javaproblems;

public class Fibonacci {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int next=0;
		int n=8;
		
		for(int i=0;i<n;i++) {
			System.out.println(first+" ");
			next=first+second;
			first=second;
			second=next;
		}
	}
}
