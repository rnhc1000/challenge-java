package application;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o tamanho do vetor: ");
    int n = sc.nextInt();
    double v;
    double [] vector = new double[n];
    int i=0;
    while (n > 0) {
      System.out.print("Informe o valor " + i + ": ");
      vector[i] = sc.nextDouble();
      i++;
      n--;
    }
    double sum =0.0;
    for (double s : vector) {
      sum+=s;
    }
    System.out.println(Arrays.toString(vector));
    System.out.println(("Soma: " + sum));
    System.out.println("Average: " + sum/(vector.length));
  }
}
