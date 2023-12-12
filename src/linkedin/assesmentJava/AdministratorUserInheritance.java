package linkedin.assesmentJava;


class Administrator extends AdministratorUserInheritance {
  public void register() {
    System.out.println("Administrator");
  }
}
public class AdministratorUserInheritance {

  public void register() {
    System.out.println("User");
  }

  public static void main(String[] args) {
    AdministratorUserInheritance administratorUserInheritance = new Administrator();
    Administrator administrator = new Administrator();
    administratorUserInheritance.register();
    administratorUserInheritance.register();
  }
}
