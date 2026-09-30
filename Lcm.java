package javaproblems;

public class Lcm {
	public static void main(String[] args) {
		int a=5;
		int b=7;

		int lcm=a*b/lcm(a,b);
		System.out.println(lcm);
	}
	static int lcm(int x,int y) {
		while(y!=0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		return x;


	}

}
