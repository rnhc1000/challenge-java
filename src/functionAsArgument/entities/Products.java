package functionAsArgument.entities;
import java.util.Objects;

public class Products {

  private String name;
  private Double price;

  public Products(){}

  public Products(String name, Double price) {
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
    functionAsArgument.entities.Products product = (functionAsArgument.entities.Products) o;
    return Objects.equals(name, product.name) && Objects.equals(price, product.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  public static boolean ProductPredicate(functionAsArgument.entities.Products product) {
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
  public static String staticUpperCaseName(functionAsArgument.entities.Products product) {
    return product.getName().toUpperCase();
  }
  public String nonStaticUpperCaseName() {
    return getName().toUpperCase();
  }
  public void nonStaticPriceUpdate() {
    price*= 1.1;
  }
}
