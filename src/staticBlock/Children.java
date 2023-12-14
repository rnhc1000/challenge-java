package staticBlock;


class Parent {
  public Parent() {
  System.out.println("Parent");
  }
  static {
    System.out.println("Parent static anonymous block");
  }
  {
    System.out.println("Non-static Parent anonymous block");
  }
}
public class Children extends Parent {
  public Children() {
    System.out.println("Children");
  }

  static {
    System.out.println("Children static block");
  }

  {
    System.out.println("Non-static Children anonymous block");
  }

  public static void main(String[] args) {
    System.out.println("Start");
    Children children = new Children();
    System.out.println("End");
  }
}


