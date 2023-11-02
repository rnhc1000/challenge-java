package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * --- local
 * LocalDate
 * LocalDateTime
 * --- global
 * Instant
 * --- period between dates
 * Duration
 * --- misc
 * ZoneId
 * ChronoUnit
 */
public class DataHora {
  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmx = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter fmz = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault() );
    LocalDate dataOne = LocalDate.now();
    System.out.println(dataOne);
    LocalDateTime dateTwo = LocalDateTime.now();
    System.out.println(dateTwo);
    Instant instant = Instant.now();
    Instant instantOne = Instant.parse("2023-11-02T01:25:59Z");
    System.out.println(instant);
    LocalDate dateThree = LocalDate.parse("2023-11-02");
    System.out.println(dateThree);
    LocalDate dateFour = LocalDate.of(2023,11, 23);
    System.out.println(dateFour);
    LocalDate dateFive = LocalDate.parse("02/11/2023",fmt);
    System.out.println(dateFive);
    System.out.println(dateThree.format(fmt));
    System.out.println(fmx.format(dateTwo));
    System.out.println(fmz.format(instantOne));
    for (String s : ZoneId.getAvailableZoneIds()) {
      System.out.println(s);
    }
    LocalDateTime r1= LocalDateTime.ofInstant(instantOne,ZoneId.of("US/Pacific"));
    System.out.println(r1);
  }
}
