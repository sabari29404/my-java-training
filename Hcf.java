package javaproblems;

public class Hcf {
	public static void main(String[] args) {
		int a=35;
		int b=7;
		int hcf=hcf(a,b);
		System.out.println(hcf);
	}
	static int hcf(int x,int y) {
		while(y>0) {
			int temp=y;
			y=x%y;
			x=temp;
		}
		return x;
	}
}
