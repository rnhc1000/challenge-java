package streamOne.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(3,4,5,10,7);
    Stream<Integer> st1 = list.stream().map(s -> s * 10);
    System.out.println(Arrays.toString(st1.toArray()));

    Stream<String> st2 = Stream.of("Maria","Pedro", "Henrique", "Ricardo").filter(x -> x.startsWith("R")).map(s -> s + " Ferreira");
    System.out.println(Arrays.toString(st2.toArray()));

    Stream<Integer> st3 = Stream.iterate(0, x -> x + 2).limit(20);
    System.out.println(Arrays.toString(st3.toArray()));
    List<Integer> l = Stream.iterate(1, x -> x + 2).limit(20).toList();
    for (Integer d : l){
      System.out.print(d + " ");
    }
    System.out.println("---------------------------------------------");

    Stream<Long> fibonacci = Stream.iterate(new Long[]{0L,1L}, p -> new Long[] { p[1],p[0]+p[1]} ).map(p -> p[0]);
    System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
  }
}
