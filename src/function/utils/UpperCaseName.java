package function.utils;

import java.util.function.Function;
import function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

  @Override
  public String apply(Product product) {
    return product.getName().toUpperCase();
  }
}
