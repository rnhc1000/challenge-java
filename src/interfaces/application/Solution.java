package interfaces.application;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalService;

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
    System.out.print("Entre com o preço por hora:");
    double pricePerHour = sc.nextDouble();
    System.out.print("Entre com o preço por um dia: ");
    double pricePerDay = sc. nextDouble();
    RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
    rentalService.processInvoice(cr);
    System.out.println("FATURA");
    System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
    System.out.println("Imposto: " + cr.getInvoice().getTax());
    System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

//    BrazilTaxService tax = new BrazilTaxService();
//    System.out.printf("%.2f%n",tax.tax(51));
  }
}
