package interfaces.model.entities;

import java.time.LocalDateTime;

public class CarRental {
  private LocalDateTime start;
  private LocalDateTime finish;
  private Vehicle vehicle;
  private Invoice invoice;
  public CarRental(){}
  public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
    this.start = start;
    this.finish = finish;
    this.vehicle = vehicle;
  }
  public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice) {
    this.start = start;
    this.finish = finish;
    this.vehicle = vehicle;
    this.invoice = invoice;
  }

  public CarRental(LocalDateTime start, LocalDateTime finish) {
    this.start = start;
    this.finish = finish;
  }

  public LocalDateTime getFinish() {
    return finish;
  }

  public void setFinish(LocalDateTime finish) {
    this.finish = finish;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public LocalDateTime getStart() {
    return start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getEnd() {
    return finish;
  }

  public void setEnd(LocalDateTime finish) {
    this.finish = finish;
  }
}