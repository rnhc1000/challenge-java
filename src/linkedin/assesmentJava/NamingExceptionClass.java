package linkedin.assesmentJava;


import javax.naming.InvalidNameException;
import javax.naming.NamingException;

public class NamingExceptionClass {
  public void bind() {
    try {
      throw new NamingException("Naming Failure");
    } catch (Exception e) {
      try {
        throw new InvalidNameException("Empty Name not Allowed!");
      } catch (NamingException ex) {
        System.out.println("Bind failed!!!");
      }
    }
  }

  public static void main(String[] args) {
    new NamingExceptionClass().bind();
  }
}
