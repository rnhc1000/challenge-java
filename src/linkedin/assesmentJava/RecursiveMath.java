package linkedin.assesmentJava;

public class RecursiveMath {
  static int method(int n) {
    if (n<=1) {
      return n;
    } else {
      return method(n-1) + method(n-2);
    }
  }

  public static void main(String[] args) {
    int number = 5;
    for (int i=1; i<=number; i++) {
      System.out.print(method(i) + " ");
    }
  }
}
