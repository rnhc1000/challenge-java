package pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(3,1,8,17,27,57,75,45,4,5,10,7);
    Stream<Integer> st1 = list.stream().map(x -> x * 10).sorted();
    System.out.println(Arrays.toString(st1.toArray()));
    int sum = list.stream().reduce(0, (x,y) -> x + y);
    System.out.println("Sum: " + sum);
    List<Integer> newList = list.stream()
            .filter(x -> x % 2 ==0)
            .map(x -> x * 10)
            .sorted()
            .toList();
    System.out.println(Arrays.toString(newList.toArray()));
  }
}
