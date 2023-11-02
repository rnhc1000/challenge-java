package packOne;

import java.util.Stack;
import java.util.*;
import java.util.function.UnaryOperator;

public class Generik<E> {
  Stack<E> stk = new Stack<E>();

  public void push(E obj) {
    stk.push(obj);
  }

  public E pop() {
    return stk.pop();
  }
}

class Output {
  public static void main(String args[]) {
    Generik<String> gs = new Generik<String>();
    gs.push("Hello");
    System.out.println(gs.pop());
    Formatter data = new Formatter();
    data.format("course %s", "java ");
    System.out.println(data);
    data.format("tutorial %s", "Merit campus");
    System.out.println(data);
    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);
    map.put("c", 3);
    int result = 0;
    String k = "";

    for (Map.Entry<String, Integer> set : map.entrySet()) {
      result += set.getValue();
      k += set.getKey();
      System.out.println("key: " + set.getKey() + " value: " + set.getValue() );
    }


    System.out.println(result); // outputs 6

    map.forEach((key, value) -> System.out.println("key:-> " + key + " value:-> " + value));
    int yearsMarried = 3;
    switch (yearsMarried) {
      case 1:
        System.out.println("paper");
      case 2:
        System.out.println("cotton");
      case 3:
        System.out.println("leather");
      default:
        System.out.println("I don't gotta buy gifts for nobody!");
    }

    List<String> dates = new ArrayList<>(List.of("/", "/", "/", "/"));
    System.out.println(dates);
    List<String> list1 = new ArrayList<>();
    list1.add("One");
    list1.add("Two");
    list1.add("Three");

    List<String> list2 = new ArrayList<>();
    list2.add("Two");

    boolean a = list1.remove(list2);
    System.out.println(a);
    System.out.println(list1);
    System.out.println(list2);


    UnaryOperator<String> replaced = date ->date.replace("/", "-");
    dates.replaceAll(replaced);
    System.out.println(dates);

    String val = "Sam";
    Optional<String> opt = Optional.of(val);
    System.out.println(opt.isPresent());
  }

}

