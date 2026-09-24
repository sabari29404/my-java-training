package exception;
import java.util.InputMismatchException;

import java.util.Scanner;
class invalidageexception extends Exception{

	public invalidageexception(String some){
		super(some);
	}
}

class agevalidator{
	void checkage(int age) {
		try {
			
			if(age<0||age>150) {
				throw new invalidageexception("the input is not valid");
			}
		}
		catch(invalidageexception e) {
			System.out.println(e);
		}
		catch(InputMismatchException a) {
			System.out.println("integer error");
		}
	}
}

public class mainclass {

	public static void main(String[] args) {
		agevalidator obj=new agevalidator();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int age=scan.nextInt();
		obj.checkage(age);
	}
}
