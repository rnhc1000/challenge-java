package streamChallengeTwo.entities;

public class Employex {
  private String name;
  private String email;

  private Double salary;

  public Employex() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Employex(String name, String email, Double salary) {
    this.name = name;
    this.email = email;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employex{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", salary=" + salary +
            '}';
  }
}
