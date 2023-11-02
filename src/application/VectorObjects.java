package application;

import java.util.Arrays;
import java.util.Scanner;

class Products {
  private String name;
  private double price;

  public Products() {}
  public Products(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return
            "name= " + name +
            ", price= " + price
            ;
  }
}
public class VectorObjects {

  public static void main(String[] args) {

    Products product = new Products();

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o numero de produtos: ");
    int n = sc.nextInt();
    int m = n;
    sc.nextLine();
    System.out.print("Digite nome e preço de cada produto!");
    System.out.println();
    String nome;
    double price;
    Products [] vector = new Products[n];
    int i=0;
    while (m>0) {
      System.out.print("Digite o nome do produto: ");
      nome = sc.next();
      System.out.print("Digite o preço do produto:");
      price = sc.nextDouble();
      vector[i] = new Products(nome, price);
      m--;
      i++;
    }

    System.out.println(Arrays.toString(vector));

    double sum = 0.0;
    for (int k=0; k<n; k++) {
      sum+=vector[k].getPrice();
    }
    System.out.printf("\nSoma: %.2f", sum);
    }

  }

