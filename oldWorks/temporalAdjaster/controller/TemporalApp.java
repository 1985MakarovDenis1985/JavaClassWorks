package temporalAdjaster.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalApp {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date = date.withYear(2025);
        date = date.withMonth(3);
        date = date.withDayOfMonth(28);
        date = date.withDayOfYear(256);
        System.out.println(date);

        date = date.with(ChronoField.YEAR, 2022); // какое поле на что изменить
        System.out.println(date);

        date = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(date);
        date = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(date);
        date = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.FRIDAY)); // 4 пятница в этом месяце
        System.out.println(date);




    }
}
