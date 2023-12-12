package linkedin.assesmentJava;

interface Payment {
  default String type() {
    return "none";
  }
}
abstract class RewardPoints{
  abstract String type();
}
public class CastOfAbstractClass extends RewardPoints implements Payment{

  public CastOfAbstractClass() {
    super();
  }


  public static void main(final String[] args) {
    System.out.println(((RewardPoints) new CastOfAbstractClass()).type());
  }

  @Override
  public String type() {
//    return Payment.super.type();
//    prints "none"
    return "points";
  }
}
