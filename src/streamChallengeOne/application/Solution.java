package streamChallengeOne.application;

import streamOne.entities.Productx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Read a file that has a list of products
 * name and price...
 * Goal: Return the average price of the products
 * Goal: Return a list of products with prices less
 * than the average...
 */
public class Solution {
  public static void main(String[] args) {

    String path = "/home/rferreira/dev/javaLearning/products.txt";
    List<Productx> list = new ArrayList<Productx>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      String line = null;

      while ((line = br.readLine()) != null) {

        String [] lines = line.split(",");
        list.add(new Productx(lines[0], Double.parseDouble(lines[1])));

      }

    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());

    } catch (IOException e) {
      System.out.println();
    }

    for (Productx p : list) {
      System.out.println(p);
    }

    Double sum = list.stream().map(Productx::getPrice).reduce(0.0, (x,y)->x+y);
    int avg = (int) list.stream().map(Productx::getPrice).count();
    double average = (double)sum/avg;

    List<String> l = list.stream().filter(x -> x.getPrice()<average).map(Productx::getName).sorted().toList();
    System.out.println("Average price: " + String.format("%.2f",average));
    for (String cc : l){
      System.out.println(cc);
    }

  }
}
