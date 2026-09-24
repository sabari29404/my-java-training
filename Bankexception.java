package exception;
import java.util.Scanner;
class invalidCustomerException extends Exception{
	//invalidCustomerException(String content){
		//super(content);
	public String getMessage() {
		return "invalid credentials";
	}
}
class ATM{
	int an;
	int pwd;
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your account number:");
		an=scan.nextInt();
		System.out.println("Enter password");
		pwd=scan.nextInt();
	}
	void verify(int accountNumber,int password) throws invalidCustomerException{
		if(accountNumber==an && password==pwd) {
			System.out.println("proceed!!! collect your money");
		}
		else {
			invalidCustomerException ice=new invalidCustomerException();
			System.out.println(ice.getMessage()+" in ATM machine");
			throw ice;
		}
	}
}
class bank{
	int accountnumber=1111;
	int password=2222;
	void initiate() {
		try {
		ATM atm=new ATM();
		atm.acceptInput();
		atm.verify(accountnumber, password);
		}
		catch(invalidCustomerException ice) {
			System.out.println(ice.getMessage()+"in bank");
		}
	}
}

public class Bankexception {

	public static void main(String[] args) {
		bank b=new bank();
		b.initiate();
	}

}
