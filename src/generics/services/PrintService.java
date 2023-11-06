package generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

  private Integer value;
  protected List<Integer> list = new ArrayList<>();

  public PrintService() {

  }

  public void addValue(Integer value) {
    list.add(value);
  }
  public Integer first(){
    if (list.isEmpty()) {
      throw new IllegalStateException("List is empty");
    }
    return list.get(0);
  }
  public void print(){
    System.out.print("[ ");
    for (Integer integer : list) {
      System.out.print(integer + " ");
    }
    System.out.print("]");
  }
}
