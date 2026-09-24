package exception;

class UnderAgeException extends Exception{
	UnderAgeException(String matter){
		super(matter);
	}
}

class ticketing{
	void bookticket(int age) throws UnderAgeException{
		if(age<13) {
			throw new UnderAgeException("You must be at least 13 years old to book this ticket.");
		}
		else {
			System.out.println("Ticket Booked Successfully");
		}
	}
	
}

public class Workout1{
	public static void main(String[] args) {
		ticketing tic =new ticketing();
		try {
			tic.bookticket(11);
		}
		catch(UnderAgeException e){
			System.out.println(e.getMessage());
		}
	}
}