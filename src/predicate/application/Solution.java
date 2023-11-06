package predicate.application;

import predicate.entities.Product;
import predicate.util.ProductPredicate;

import java.sql.SQLOutput;
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
//    else {
//      for (Product p : list) {
//        System.out.println(p);
//      }
//    }
    System.out.println("-------------------------------------");
    list.removeIf(x -> x.getName().length()> 2);
    System.out.println(list);
    System.out.println("-------------------------------------");
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
    list.removeIf(new ProductPredicate());
    System.out.println(list);
    System.out.println("-------------------------------------");
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
    System.out.println("-------------------------------------");

    list.removeIf(Product::ProductPredicate);
    System.out.println(list);

//    for (Product p : list) {
//      System.out.println(p);
//    }
  }
}
