package javaproblems;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AgeToDays {
	public static void main(String[] args) {
		
		LocalDateTime dateGet=LocalDateTime.of(2000,04,06,0,0,0);
		LocalDateTime today=LocalDateTime.now();
		
		long hours=ChronoUnit.WEEKS.between(dateGet,today );
		
		System.out.println(hours);

	}

}
