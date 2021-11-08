package timeFraimwork.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class JavaTimeApp {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
//        System.out.println(currentDate);
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
        LocalDate gagarin = LocalDate.of(1961, 4, 12);
//        System.out.println(gagarin);
//        System.out.println(gagarin.getDayOfYear()); // какой день с 1 января данного года
//        System.out.println(gagarin.getDayOfWeek()); // какой день недели тогда был
//        System.out.println(gagarin.isBefore(currentDate)); // если до now - true
//        System.out.println(gagarin.compareTo(gagarin)); // 0 (1, -1)
//        LocalDate ld = currentDate.plusDays(-10);
        LocalDate ld = currentDate.plus(50, ChronoUnit.CENTURIES);
//        System.out.println(ld);
        long t = ChronoUnit.DAYS.between(gagarin, currentDate); // сколько прошло дней от даты до даты
        t = ChronoUnit.MONTHS.between(gagarin, currentDate); // сколько прошло месяцев от даты до даты
//        System.out.println(t);

        // ------------------
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(dtf);
//        System.out.println(currentDate.format(dtf));

//        dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy"); // использовать документацию с обозначениями
        dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA); // использовать документацию с обозначениями
//        System.out.println(currentDate.format(dtf));
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("HE")); // использовать документацию с обозначениями
//        System.out.println(currentDate.format(dtf));

        String date = "1997-08-19";
        ld = LocalDate.parse(date); // переводим строку в Date объект
        System.out.println(ld.plusDays(2));
        date = "19/08/1991";
        ld = LocalDate.parse(date, dtf);
        System.out.println(ld.plusDays(3));
        // ------------------

    }
}
