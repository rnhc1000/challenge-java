package functionAsArgument.services;

import functionAsArgument.entities.Products;
import java.util.List;
import java.util.function.Predicate;

public class ProductsService {
  public double filteredSum(List<Products> list, Predicate<Products> criteria) {

    double sum = 0.0;
    for (Products product : list) {
      if (criteria.test(product)) {
        sum += product.getPrice();
      }
    }
    return sum;
  }

}
