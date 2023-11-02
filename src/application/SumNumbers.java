package application;

import java.util.Scanner;

public class SumNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o numero de digitos: ");
    int n = sc.nextInt();
    sc.nextLine();
    double [] numbers = new double[n];

    for (int i=0; i<n; i++) {
      System.out.print("Digite um numero decimal: ");
      numbers[i] = sc.nextDouble();
    }

    double sum = 0.0;
    double avg = 0.0;

    for (double number : numbers) {
      sum+=number;
    }
    System.out.printf("Valores: ");
    for (double number : numbers) {
      System.out.printf("%.2f ", number);
    }
    System.out.println();
    System.out.printf("Sum = %.2f, Avg = %.2f", sum, sum/numbers.length);
  }
}
