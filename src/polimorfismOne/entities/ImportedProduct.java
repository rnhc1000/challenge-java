package polimorfismOne.entities;

import java.time.LocalDate;

public class ImportedProduct extends Product {

  private Double customFee;
  private Double price;

  public ImportedProduct(Double customFee) {
    this.customFee = customFee;
  }

  public ImportedProduct(String name, Double price, Double customFee) {
    super(name);
    this.price = price;
    this.customFee = customFee;
  }

  public Double getCustomFee() {
    return customFee;
  }

  public void setCustomFee(Double customFee) {
    this.customFee = customFee;
  }

  @Override
  public Double getPrice() {
    return price + getCustomFee();
  }

  @Override
  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "ImportedProduct{" +
            "customFee=" + customFee +
            '}';
  }

  @Override
  public String priceTag() {
    return "(Custom fee: $ " + Double.toString(getCustomFee()) + ")";
  }

  @Override
  public Double totalPrice() {
    return getPrice() + getCustomFee();
  }
}