package exception;

class InvalidAge extends Exception{
	public InvalidAge(String msg) {
		super(msg);
	}
}

class Verification{
	void verifyAge(int age) throws InvalidAge {
		if(age<18) {
			throw new InvalidAge("you are not valid!");
		}
	}
}

class ImpossibleAge extends RuntimeException{
	public ImpossibleAge(String msg) {
		super(msg);
	}
}

public class ExceptionsRough {
	public static void main(String[] args) {
		
		int age=121;
		
		Verification ver1=new Verification();
		try {
			ver1.verifyAge(age);
			if(age>120) {	
				throw new ImpossibleAge("you are sup");
			}
			else {
				System.out.println("you are Valid");
			}
		}
		catch(InvalidAge e) {
			System.out.println(e);
		}
		
	}

}
