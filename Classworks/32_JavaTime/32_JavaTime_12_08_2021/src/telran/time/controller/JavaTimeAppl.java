package telran.time.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaTimeAppl {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDate gagarin = LocalDate.of(1961, 4, 12);
		System.out.println(gagarin);
		System.out.println(gagarin.getDayOfWeek());
		System.out.println(gagarin.getDayOfYear());
		System.out.println(gagarin.isAfter(currentDate));
		LocalDate ld = currentDate.plus(-4, ChronoUnit.DAYS);
		System.out.println(ld);
		long t = ChronoUnit.MONTHS.between(gagarin, currentDate);
		System.out.println(t);
		DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(currentDate.format(dtf));
		dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld.format(dtf));
		String date = "1991-08-19";
		ld = LocalDate.parse(date);
		System.out.println(ld.plusDays(2));
		date = "19/08/1991";
		ld = LocalDate.parse(date, dtf);
		System.out.println(ld.plusDays(3));
	}

}
