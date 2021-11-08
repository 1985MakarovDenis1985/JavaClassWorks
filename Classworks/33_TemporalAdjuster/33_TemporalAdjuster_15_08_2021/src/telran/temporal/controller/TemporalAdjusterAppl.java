package telran.temporal.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterAppl {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		date = date.withDayOfYear(256);
		System.out.println(date);
		date = date.with(ChronoField.YEAR, 2022);
		System.out.println(date);
		date = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(date);
		date = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(date);
		date = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.FRIDAY));
		System.out.println(date);
	}

}
