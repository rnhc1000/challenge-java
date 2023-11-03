package polimorfismOne.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {
  private String manufactureDate;

  public UsedProduct() {
    super();
  }

  public UsedProduct(String name, Double price, String manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public String getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(String manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  @Override
  public String toString() {
    return "UsedProduct{" +
            "manufactureDate=" + manufactureDate +
            '}';
  }

  @Override
  public String priceTag(){
    return "(Manufacture date: " + getManufactureDate() + ")";
  }
}
