package streamChallengeOne.application;

import streamOne.entities.Productx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Read a file that has a list of products
 * name and price...
 * Goal: Return the average price of the products
 * Goal: Return a list of products with prices less
 * than the average...
 * Hint:
 * filter(x->x.getPrice < average).map(Productx::getName)
 *
 */

public class Solution {
  public static void main(String[] args) {

    String path = "/home/rferreira/dev/javaLearning/products.txt";
    List<Productx> list = new ArrayList<Productx>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = null;

      while ((line = br.readLine()) != null) {

        String[] lines = line.split(",");
        list.add(new Productx(lines[0], Double.parseDouble(lines[1])));

      }

      Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

      Double average = list.stream().
              map(Productx::getPrice)
              .reduce(0.0, (x, y) -> x + y)
              / list.size();

      List<String> smallestPrices = list.stream()
              .filter(x -> x.getPrice() < average)
              .map(Productx::getName)
              .sorted(comp.reversed()).toList();

      System.out.println("Average price: " + String.format("%.2f", average));

      smallestPrices.forEach(System.out::println);

    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());

    } catch (IOException e) {
      System.out.println();
    }

  }

}

