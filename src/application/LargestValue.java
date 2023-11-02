package application;

import java.util.Arrays;
import java.util.Scanner;

public class LargestValue {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros vc vai digitar? ");
    int n = sc.nextInt();
    sc.nextLine();
    int [] v = new int[n];
    int i=0;
    while (n > 0) {
      System.out.print("Digite um numero: ");
      v[i] = sc.nextInt();
      sc.nextLine();
      i++;
      n--;
    }
//    Arrays.sort(v);
    int pos = 0;
    int max = v[0];
    for (int k=0;k<v.length-1;k++) {

      if (v[k] > max) {
        max = v[k];
        pos = k;
      }

    }
    System.out.println(max + " " + pos );

    for (int k=0;k<v.length-1;k++) {
     max = Math.max(v[k], v[k+1]);
    }
    System.out.println(max);
  }
}
