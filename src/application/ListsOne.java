package application;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListsOne {

  public static void main(String[] args) {

    List<String> list = new ArrayList<String>();
    list.add("Ricardo");
    list.add("Ferreira");
    list.add("Perpetua");
    list.add("Socorro");
    list.add(1, "Alves");
    list.add(3, "Silva");
    System.out.println(list);
    System.out.println(list.size());
    list.remove("Silva");
    list.remove(0);
    for (String s : list){
      System.out.println(s);
    }
    list.add(0,"Ricardo");
    System.out.println(list);
    list.removeIf(x -> x.charAt(0) == 'R');
    System.out.println(list);
    list.add(0,"Ricardo");

    System.out.println("Index of " + list.indexOf("Ferreira"));
    String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
    System.out.println("My name is: " + name);
    System.out.println("-------------------");
    List<Integer> square = new ArrayList<Integer>();
    square.add(1);
    square.add(2);
    square.add(3);
    square.add(4);
    square.add(5);
    square.add(6);
    square.add(7);
    square.add(8);
    square.add(9);
    square.add(10);

    //square.removeIf(x -> x % 2 == 0);
    System.out.println(square);

    List<Integer> odd = new ArrayList<Integer>();
    List<Integer> even = new ArrayList<Integer>();
    odd  = square.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
    even = square.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    System.out.println(odd);
    System.out.println(even);
  }

}
