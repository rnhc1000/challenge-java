package linkedin.assesmentJava;

class Booking<T> {
  T id;
  public void confirm(T id) {
    System.out.println("Booking reference number: " + id);
  }
}
public class TypeSafety {
  public static void main(String[] args) {
    Booking<String> booking = new Booking<String>();
    booking.confirm("AB234567");
  }
}
