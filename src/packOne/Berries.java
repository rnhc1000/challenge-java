package packOne;

import java.util.PriorityQueue;

public class Berries {
  static int xx;
  static int yy;
  String berry = "blue";

  public static void main(String[] args) {
    new Berries().juicy("straw");
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(4);
    queue.add(3);
    queue.add(2);
    queue.add(1);

    while (queue.isEmpty() == false) {
      System.out.printf("%d", queue.remove());
    }
    xx = 5;
    yy = 10;
    swapsies(xx, yy);
    System.out.println(xx + " " + yy);
    int count = 0;
    if (count < 3) {
      count++;
      main(null);
    } else {
      return;
    }
    System.out.println("Hello World!");

  }

  static void swapsies(int a, int b) {
    int temp = a;
    a = b;
    b = temp;

  }

  void juicy(String berry) {
    this.berry = "rasp";
    System.out.println(berry + "berry");
  }


}