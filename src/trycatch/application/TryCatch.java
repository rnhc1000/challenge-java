package trycatch.application;

import trycatch.model.entities.Reservation;
import trycatch.model.exceptions.DomainException;

import java.security.DomainLoadStoreParameter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      System.out.print("Room number: ");
      int number = sc.nextInt();
      System.out.print("Check-in date (dd/MM/YYYY): ");
      Date checkIn = formatter.parse(sc.next());
      System.out.print("Check-out date (dd/MM/YYYY): ");
      Date checkOut = formatter.parse(sc.next());
      Reservation reservation = new Reservation(number, checkIn, checkOut);
      System.out.println("Reservation: " + reservation);
      System.out.println();
      System.out.println("Enter date to update the reservation:");
      System.out.print("Check-in date (dd/MM/YYYY): ");
      checkIn = formatter.parse(sc.next());
      System.out.print("Check-out date (dd/MM/YYYY): ");
      checkOut = formatter.parse(sc.next());

      reservation.updateDates(checkIn, checkOut);
      System.out.println("Reservation: " + reservation);
    } catch (ParseException e) {
      System.out.println("Invalid date format");
    } catch (DomainException e) {
      System.out.println("Error in reservation " + e.getMessage());
    }
    sc.close();
  }
}
