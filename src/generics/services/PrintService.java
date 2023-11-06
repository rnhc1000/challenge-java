package generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

  private Integer value;
  protected List<T> list = new ArrayList<T>();

  public PrintService() {

  }

  public void addValue(T value) {
    list.add(value);
  }

  public T first() {

    if (list.isEmpty()) {
      throw new IllegalStateException("List is empty");
    }
    return list.get(0);
  }

  public void print() {
    System.out.print("[ ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
      System.out.print("]");
    }
  }
}
