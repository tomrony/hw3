package hw3;
import java.time.*;
import java.time.temporal.ChronoUnit;


public class Birthday {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1997,Month.OCTOBER,17);
		ZonedDateTime current = ZonedDateTime.now(); 
		LocalTime time = LocalTime.of(8, 00);
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime birthday = ZonedDateTime.of(date, time, zone);
		long days = birthday.until(current, ChronoUnit.DAYS);
		System.out.println("DaysAlive " + days);

	}
}
