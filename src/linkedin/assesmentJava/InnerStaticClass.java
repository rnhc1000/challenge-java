package linkedin.assesmentJava;

import linkedin.assesmentJava.Timer.ConvertMinutesToSeconds;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Timer {
  int numOfSeconds;

   static class ConvertMinutesToSeconds<E> implements Predicate<Integer>{
//    static DoubleToIntFunction func = m -> (m * 60);

    @Override
    public boolean test(Integer integer) {
      Integer i = 18;
      return integer >= i;
    }

    public static Double mul(Double num) {
      return num * 60;
    }
  }
}
public class InnerStaticClass {

  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.numOfSeconds = 100;
    double additionalTime=2.5d;
    timer.numOfSeconds += Timer.ConvertMinutesToSeconds.mul(additionalTime);
    System.out.print(timer.numOfSeconds);
    List<Integer> list = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
    ConvertMinutesToSeconds<Object> convert = new ConvertMinutesToSeconds<>();
    System.out.print("\n\n=====>\n");
    list.stream().filter(convert).forEach(System.out::println);
  }
}
