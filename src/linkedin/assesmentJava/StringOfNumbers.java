package linkedin.assesmentJava;

import java.util.Arrays;

public class StringOfNumbers {
  public static void main(String[] args) {
    String[] numbers = new String[] {"2", "6", "25"};
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
//    [2, 25, 6]
    int [] n = new int[]{ 2, 25, 6};
    Arrays.sort(n);
    System.out.println(Arrays.toString(n));
//    [2, 6, 25]
  }
}
