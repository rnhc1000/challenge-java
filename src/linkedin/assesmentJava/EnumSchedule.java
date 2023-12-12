package linkedin.assesmentJava;

public class EnumSchedule {
  public enum When {
    ALWAYS,
    UNKNOWN,
    MAYBE,
    NEVER
  }

  public static void main(String[] args) {
    System.out.println(When.ALWAYS.ordinal());
    System.out.println(When.valueOf("NEVER"));
  }
}
