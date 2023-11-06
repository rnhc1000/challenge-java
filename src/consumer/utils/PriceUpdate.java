package consumer.utils;

import consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
  @Override
  public void accept(Product product) {
    product.setPrice(product.getPrice() * 1.10) ;
  }

}
