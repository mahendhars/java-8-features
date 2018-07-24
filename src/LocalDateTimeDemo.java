import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
	
	public static void main(String args[]) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate someDate = LocalDate.of(2013, 2, 23);
		System.out.println(someDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime specificTime = LocalTime.of(14, 0, 30);
		System.out.println(specificTime);
		
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println(currentDT);
		
		LocalDateTime specificDT = LocalDateTime.of(someDate, specificTime);
		System.out.println(specificDT);
	}
}
