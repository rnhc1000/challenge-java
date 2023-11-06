package genericsOne.application;

import genericsOne.entities.Product;
import genericsOne.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {

    List<Product> list = new ArrayList<Product>();
    String path = "/home/rferreira/dev/javaLearning/products.txt";
    String line = null;
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      while ((line = br.readLine()) != null) {
        String[] lines = line.split(",");
        list.add(new Product(lines[0], Double.parseDouble(lines[1])));
      }
      Product x = CalculationService.max(list);
      System.out.print("Max: " + x);
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
