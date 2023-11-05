package interfaces.application;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com os dados do aluguel:");
    System.out.print("Modelo do Carro: ");
    String carModel = sc.nextLine();
    System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
  }
}
