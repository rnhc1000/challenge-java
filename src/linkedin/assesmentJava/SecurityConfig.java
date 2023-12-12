package linkedin.assesmentJava;

public class SecurityConfig {
  public void configure() { configure(141,true);}
  public int configure(int code) { return code + 1;}
  public int configure(int code, boolean allow) {
    return configure(code);
  }
  public static void main(String... args) {
    System.out.println(new SecurityConfig().configure(10,true));
  }
}
