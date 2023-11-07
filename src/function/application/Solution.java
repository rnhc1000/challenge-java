package function.application;

import function.entities.Product;
import function.utils.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
  public static void main(String[] args) {

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
    System.out.println("------------------interface----------------------");

    List<String> names  = new ArrayList<>(list.stream().map(new UpperCaseName()).toList());
    names.forEach(System.out::println);
    System.out.println("---------reference method static-------------------");
    list.clear();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    names= list.stream().map(Product::staticUpperCaseName).toList();
    names.forEach(System.out::println);
    System.out.println("---------reference method non static-------------------");
    list.clear();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));

    names= list.stream().map(Product::nonStaticUpperCaseName).toList();
    names.forEach(System.out::println);
    System.out.println("--------- lambda declarada -------------------");
    list.clear();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
    Function<Product, String> func = product -> product.getName().toUpperCase();
    names= list.stream().map(func).toList();
    names.forEach(System.out::println);
    System.out.println("--------- lambda embedded -------------------");
    list.clear();
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
    names= list.stream().map( product -> product.getName().toUpperCase()).toList();
    names.forEach(System.out::println);

  }
}
