package streamOne.entities;

public class Productx {
  private String name;
  private Double price;

  public Productx() {}
  public Productx(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Productx{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
  }
}
