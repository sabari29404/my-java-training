package exception;

import java.util.Scanner;

class LoginError extends Exception{
	public String getMessage(){
		return "re-verify the credentials";
	}
}

class LoginPage{
	String u_name;
	int u_password;
	void entry() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user-name:");
		u_name=scan.nextLine();
		u_password=scan.nextInt();
	}
	void verify() throws LoginError {
		if(u_name.equals("sabari") && u_password==1111) {
			System.out.println("login successfully");
		}
		else {
			LoginError le=new LoginError();
			System.out.println(le.getMessage()+" in Login page");
			throw le;
		}
	}
}

public class Loginserver {
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.entry();
		try {
		lp.verify();
		}
		catch(LoginError le) {
			System.out.println(le.getMessage()+"in Login server");
		}
	}
}
