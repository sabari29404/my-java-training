package exception;

class underAgeException extends Exception {
	/*underAgeException(String content) {
		super(content);
	}*/
	public String getMessage() {
		return "invalid credentials";
	}
}

class verification{

	void verify(int age) throws underAgeException {
	if(age<18) {
		throw new underAgeException();
	}
	else {
		System.out.println("u r eligible");
	}
}
}

public class Ownexception {

	public static void main(String[] args) {
		verification ver=new verification();
		try {
		ver.verify(17);
		}
		catch(underAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
