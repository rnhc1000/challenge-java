package generics.application;

import generics.services.PrintService;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Qty to be printed:");
    int count = sc.nextInt();
    sc.nextLine();
    PrintService ps = new PrintService();
    for (int i=0; i<count; i++){
      System.out.printf("Value: %d", i, ": ");
      Integer added = sc.nextInt();
      sc.nextLine();
      ps.addValue(added);
    }
    ps.print();
    System.out.println();
    System.out.println(ps.first());

    sc.close();
  }
}
