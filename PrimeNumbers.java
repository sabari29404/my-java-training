package javaproblems;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num=23;
		
		for(int i=2;i<=num;i++) {
			boolean isprime=true;
		for(int j=2;j<Math.sqrt(i);j++) {
			if(i%j==0) {
				isprime=false;
				break;
			}
		}
		if(isprime==true) {
			System.out.println(i);
		}
		/*else {
			System.out.println("consonant number");
		}*/
	}
	}

}
