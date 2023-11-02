package application;

import java.util.Scanner;

public class NegativeNumbers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o numero de digitos: ");
    int n = sc.nextInt();
    int [] vector = new int[n];
    for (int i=0; i<n; i++) {
      System.out.print("Digite um numero: ");
      vector[i] = sc.nextInt();
    }
    for (int j : vector) {
      if (j < 0) {
        System.out.println(j);
    }
    sc.close();
    }
  }
}
