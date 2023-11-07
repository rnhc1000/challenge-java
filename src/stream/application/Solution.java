package stream.application;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {

    List<String> items = new ArrayList<String>();
    items.add("um");
    items.add("dois");
    items.add("três");
    Stream<String> stream = items.stream().filter(p -> p.startsWith("u"));
    List<String> a = stream.toList();
    for (String x : a)
      System.out.print(a + " ");
    System.out.println("---------------------------");


    List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    for (Integer i : list) {
      System.out.print(i + " ");
    }

    System.out.println("---------------------------");

    List<Integer> l = list.stream().filter(x -> x % 2 == 0).toList();
    List<Boolean> m = list.stream().map(x -> x % 2 == 0).toList();
    List<Boolean> n = m.stream().filter(x -> !x).toList();

    for (Integer x : l) {
      System.out.print(x + " ");
    }
    System.out.println("---------------------------");

    for (Boolean j: m){
      System.out.print(j + " ");
    }
    System.out.println("---------------------------");

    for (Boolean k : n) {
      System.out.print(k + " ");
    }
  }
}
