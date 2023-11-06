package consumer.entities;

import java.util.Objects;

public class Product {
  private String name;
  private Double price;

  public Product(){}

  public Product(String name, Double price) {
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    consumer.entities.Product product = (consumer.entities.Product) o;
    return Objects.equals(name, product.name) && Objects.equals(price, product.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  public static boolean ProductPredicate(consumer.entities.Product product) {
    return product.getPrice() >= 100.0;
  }
  public boolean ProductPredicateNonStatic() {
    return price >= 100.0;
  }
  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", price=" + String.format("%.2f" , price) +
            '}';
  }
  public static void staticPriceUpdate(Product product) {
    product.setPrice(product.getPrice() * 1.1);
  }
}
