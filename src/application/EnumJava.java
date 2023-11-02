package application;

import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * especificar de forma literal
 * um conjunto de constantes
 * relacionadas.
 */
public class EnumJava {

  enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED
  }
  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

    Scanner sc = new Scanner(System.in);
    System.out.print("Status? ");
    String str = sc.nextLine();
    int x =0;
    LocalDateTime moment;
    OrderStatus status;
    status = OrderStatus.DELIVERED;
    OrderStatus s = OrderStatus.valueOf(str);
    moment = LocalDateTime.now();
    Instant instant = Instant.now();
//    instant = Instant.parse(fmt.format(instant));
    if (s.equals(OrderStatus.SHIPPED)) {
      System.out.println(moment);
    } else if (s.equals(OrderStatus.DELIVERED)) {
      System.out.println(instant);
    }
    sc.close();
  }
}
