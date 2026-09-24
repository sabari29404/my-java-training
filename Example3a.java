package exception;

import java.util.Scanner;

class demo1{
	void fun1() throws ArithmeticException{
		System.out.println("connection2 established");
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter numer");
			int a=scan.nextInt();
			System.out.println("Entr denom");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("problem resolved in fun1");
			throw e;
		}
		finally {
			System.out.println("connection2 terminated");
		}
	}
}

public class Example3a {

	public static void main(String[] args) {
		System.out.println("connection1 established");
		try {
			demo1 d1=new demo1();
			d1.fun1();
		}
		catch(ArithmeticException e) {
			System.out.println("problem resolved in main");
		}
		System.out.println("connection1 terminated");

	}

}