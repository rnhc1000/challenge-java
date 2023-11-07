package functionAsArgument.services;

import functionAsArgument.entities.Products;

import java.util.List;

public class ProductsService {
  public double filteredSum(List<Products> list) {

    double sum = 0.0;
    for (Products product : list) {
      if (product.getName().charAt(0) == 'T') {
        sum += product.getPrice();
      }
    }
    return sum;
  }

}
