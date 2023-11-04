package filehandling.application;

import filehandling.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChallengeFile {
  public static void main(String[] args) {

    String path = "/home/rferreira/dev/javaLearning/challengeFile/products.txt";
    String [] lines = new String[]{
            "TV LED, 1290.99,1",
            "Video Game Chair, 350.50,3",
            "Iphone X, 900.00,2",
            "Samsung Galaxy 9, 850.00,2"
    };
    List<Product> products = new ArrayList<Product>();
    List<String> p = new ArrayList<>();
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
//    String [] s = new String[]
//    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//      String lineOfFile="";
//      while (lineOfFile != null) {
//        lineOfFile= br.readLine();
//        p.add(Arrays.toString(lineOfFile.split(",")));
//        System.out.println(p);
//      }
//    } catch(IOException e) {
//      System.out.println("Error: " + e.getMessage());
//    }

    File file = new File(path);
    Scanner sc = null;
    String[] c = null;

    try {
      sc= new Scanner(file);
      while (sc.hasNextLine()) {
        String one = sc.nextLine();
//        System.out.println(one);
        c = one.split(",");
        products.add( new Product(c[0], Double.parseDouble(c[1]), Integer.parseInt(c[2])));
      }
    } catch (IOException e){
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
    int qtd = 0;
    double price = 0.09;
    path = "/home/rferreira/dev/javaLearning/challengeFile/out/summary.csv";

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
        for (Product prd : products) {
          bw.write(prd.getName() + "," + prd.getPrice() * prd.getQty());
          bw.newLine();
        }
      } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
      }
//      System.out.print(prd.getName() + " ");
//      System.out.print(prd.getPrice() * prd.getQty());
//      System.out.print(prd.getQty());
//      System.out.println();

    }
//    int price = products.get(2).getQty();
//    System.out.println(price);

  }


