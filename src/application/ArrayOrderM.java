package application;

import java.util.Random;
import java.util.Scanner;

public class ArrayOrderM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Order M: ");
    int m = sc.nextInt();
    System.out.print("Order N: ");
    int n = sc.nextInt();
    int[][] arr = new int[m][n];
    Random random = new Random();
    int min = -100;
    int max = 100;

    for (int i=0; i<arr.length;i++) {
      for (int k=0; k<arr[i].length;k++){
        arr[i][k] = random.nextInt(max-min) + min;
      }
    }
    for (int [] j : arr) {
      for (int l : j) {
        System.out.print(l + " ");
      }
      System.out.print("\n");
    }
  int x= 2;
    min = 0;
    max = arr[0].length-1;
    int p=0, q =0;
    while (x > 0) {
      p = random.nextInt(max - min) + min;
      q = random.nextInt(max - min) + min;
      x--;
    }
    System.out.println(arr[p][q] + " " + arr[p][q-1] + " " + arr[p][q+1]);
  }
}
