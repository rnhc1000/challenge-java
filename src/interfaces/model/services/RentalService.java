package interfaces.model.services;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

  private Double pricePerHour;
  private Double pricePerDay;

  private BrazilTaxService brazilTaxService;

  public RentalService(){}
  public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
    this.pricePerDay = pricePerDay;
    this.pricePerHour = pricePerHour;
    this.brazilTaxService = brazilTaxService;
  }

  public void processInvoice(CarRental carRental){

    double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
    double hours = minutes / 60.0;
    double basicPayment;
    if (hours <= 12.0) {
      basicPayment = pricePerHour * Math.ceil(hours);
    } else {
      basicPayment = pricePerDay * Math.ceil(hours / 24.0);
    }

    double tax = brazilTaxService.tax(basicPayment);
    carRental.setInvoice(new Invoice(basicPayment, tax));
  }
}
