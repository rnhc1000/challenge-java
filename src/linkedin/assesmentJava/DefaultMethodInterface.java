package linkedin.assesmentJava;

import java.util.HashMap;
import java.util.Map;

interface Trigger {
  default void enable() {
    System.out.println("Enable Trigger");
  }
}

interface Scheduler{
  default void enable() {
    System.out.println("Enable Scheduler");
  }
}
public class DefaultMethodInterface implements Trigger, Scheduler{
  @Override
  public void enable() {
    System.out.println("Enable Quartz");;
  }

  public static void main(String[] args) {
    new DefaultMethodInterface().enable();

//    Map<> map = new HashMap<String,String>();
    Map<String,String> map1 = new HashMap<>();
//    Map<String, int> map2 = new Map<int, String>;
    Map<String, String> map4 = new HashMap<String, String>();
  }
}
