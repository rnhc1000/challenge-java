package trycatch.application;

import trycatch.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

  public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    System.out.print("Room number: ");
    int number = sc.nextInt();
    System.out.print("Check-in date (dd/MM/YYYY): ");
    Date checkIn = formatter.parse(sc.next());
    System.out.print("Check-out date (dd/MM/YYYY): ");
    Date checkOut = formatter.parse(sc.next());
    if (!checkOut.after(checkIn)) {
      System.out.println("Checkout date must be after ckeckin date!");
    } else {
      Reservation reservation = new Reservation(number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);
      System.out.println();
      System.out.println("Enter date to update the reservation:");
      System.out.print("Check-in date (dd/MM/YYYY): ");
      checkIn = formatter.parse(sc.next());
      System.out.print("Check-out date (dd/MM/YYYY): ");
      checkOut = formatter.parse(sc.next());

      Date now = new Date();
      if (checkIn.before(now) || checkIn.before(now)) {
        System.out.println("wrong check dates!");
      } else if (!checkOut.after(checkIn)) {
        System.out.println("Checkout date must be after ckeckin date!");
      } else {
        reservation.updateDates(checkIn, checkOut);
        System.out.println("Reservation: " + reservation);
      }

    }

    sc.close();
  }
}
