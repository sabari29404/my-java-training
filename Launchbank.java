package exception;

import java.util.Scanner;

class invalidCustomerException extends Exception{
	public String getMessage() {
		return "Invalid Credentials";
	}
}

class ATM{
	int an;
	int pwd;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your account number:");
		an=scan.nextInt();
		System.out.println("please enter password:");
		pwd=scan.nextInt();
	}
	void verify(int accountNumber, int password) throws invalidCustomerException{
		if(accountNumber==an && password==pwd) {
			System.out.println("proceed!! collect your money");
		}
		else {
			System.out.println(new invalidCustomerException().getMessage()+" displayed on ATM's computer");
			throw new invalidCustomerException();
		}
	}
}

class bank{
	int accountNumber=1111;
	int password=2222;
	void initiate() {
		try {
			ATM atm=new ATM();
			atm.acceptInput();
			atm.verify(accountNumber, password);
		}
		catch(invalidCustomerException ice) {
			System.out.println(ice.getMessage()+" displayed on bank's computer");
		}
	}
}
public class Launchbank {
	public static void main(String[] args) {
		bank b=new bank();
		b.initiate();
	}
}
