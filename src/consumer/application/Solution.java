package consumer.application;

import consumer.utils.PriceUpdate;
import consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static void main(String[] args) {

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    if (list.isEmpty()) {
      throw new IllegalArgumentException();
    }

    list.forEach(new PriceUpdate());

    list.forEach(System.out::println);
    System.out.println("--------------------------------");
    list.forEach(Product::staticPriceUpdate);
    list.forEach(System.out::println);
    System.out.println("--------------------------------");
    list.forEach(Product::nonStaticPriceUpdate );
    list.forEach(System.out::println);
    System.out.println("--------------------------------");


  }
}
