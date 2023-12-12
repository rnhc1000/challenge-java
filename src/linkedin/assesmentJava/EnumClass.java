package linkedin.assesmentJava;



public class EnumClass {
  public enum AccountType {
    SAVINGS,
    CHECKING
  }
  public static void main(String[] args) {
    AccountType account = AccountType.SAVINGS;
    switch(account) {

      case SAVINGS:
        System.out.println("SAVINGS");

      case CHECKING:
        System.out.println("CHECKING");
    }
  }

  }

