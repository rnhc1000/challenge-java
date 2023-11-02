package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOrderN {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Input the array order: ");
    int arrayOrder = sc.nextInt();
    sc.nextLine();
    Random random = new Random();
    int max = 100;
    int min = -100;
    int count = 0;
    int[][] arr = new int[arrayOrder][arrayOrder];
    int[] diagonal = new int[arrayOrder];
    int lenArrOne = arr.length;
    int lenArrTwo = arr[0].length;
    for (int i=0; i<lenArrOne; i++) {
      for (int j=0; j<lenArrTwo; j++) {
        arr[i][j] = random.nextInt(max-min) + min;
        if(i == j) {
          diagonal[i]=arr[i][j];
        }
        if (arr[i][j] < 0){
          count++;
        }
      }
    }
    System.out.println(Arrays.toString(diagonal));
    System.out.println("Negative ones: " + count);

    for (int [] s : arr) {
      for (int t : s) {
        System.out.printf("%d ", t);
      }
      System.out.print("\n");
    }
    sc.close();
  }
}
