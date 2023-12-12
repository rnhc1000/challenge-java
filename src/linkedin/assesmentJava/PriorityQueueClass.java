package linkedin.assesmentJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {

  public static void main(String[] args) {
    Queue<String> orderId = new PriorityQueue<>();
    orderId.add("A23563");
    orderId.add("A15362");
    orderId.add("A35263");
    String order;
    while ((order = orderId.poll()) != null) {
      System.out.print(order + " ");
    }
  }
}
