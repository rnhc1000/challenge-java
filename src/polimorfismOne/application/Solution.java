package polimorfismOne.application;

import polimorfismOne.entities.ImportedProduct;
import polimorfismOne.entities.Product;
import polimorfismOne.entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Product> products = new ArrayList<Product>();
    System.out.print("Enter the no. of Products: ");
    int numberOfProducts = sc.nextInt();
    sc.nextLine();
    int count=1;

    while (numberOfProducts > 0) {
      System.out.println("Product #" + count + " data");
      System.out.print("Common, used or imported (c/u/i)? ");
      char ch = sc.next().charAt(0);
      sc.nextLine();
      if (ch == 'c') {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        products.add(new Product(name, price));
      } else if(ch == 'i') {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Custom Fee: ");
        Double customFee = sc.nextDouble();
        products.add(new ImportedProduct(name, price, customFee));
      } else if (ch == 'u') {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Manufacture Date (DD/MM/YYYY): ");
        String manufactureDate = sc.nextLine();
        products.add(new UsedProduct(name, price, manufactureDate));
      }
      numberOfProducts--;
      count++;
    }
    System.out.println("PRICE TAGS");
    for (Product p : products) {
      System.out.println(p.getName() + " " + " $" +String.format("%.2f", p.getPrice()) + " " + p.priceTag() );
    }
  }
}
