package java_8.date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /*
                Pre java 8: Date and Calendar located in java.util. These had shortcomings
                > Not threadsafe or immutable
                > There was also a Data class in java.sql which was confusing
                > getMonth() is zero-based, getYear() is 1900 based (i.e. 2009 is 109).

                Since java 8:
                Classes located in java.time
                > fixes the above problems
         */

        //dates:
        LocalDate ld = LocalDate.of(2022, 1, 13);
        //times:
        LocalTime lt = LocalTime.of(16,55); //or LocalTime.now();
        //date and time
        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        //zoned date and time
        //for (String s : ZoneId.getAvailableZoneIds()) System.out.println(s);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Navajo"));

        //calculations are much easier with the new API:
        ld = ld.plusMonths(1); //becuase immutable

        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println(ld.format(dtf));

    }
}