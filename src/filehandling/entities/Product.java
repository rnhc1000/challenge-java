package filehandling.entities;

public class Product {
  private String name;
  private Double price;
  private Integer qty;

  public Product() {
  }
  public Product(String name, Double price, Integer qty) {
    this.name = name;
    this.price = price;
    this.qty = qty;
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

  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  @Override
  public String toString() {
    return "Produto: "
            + name
            + ", Preco: "
            + price
            + ", Qty: "
            + qty;
  }
}
