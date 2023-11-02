package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {

  private Integer Id;
  private String name;
  private Double salary;

  public Employee() {
  }

  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return
            "Id=" + Id +
            ", name='" + name + '\'' +
            ", salary=" + salary ;
  }

  public Employee(Integer Id, String name, Double salary) {
    this.Id = Id;
    this.name = name;
    this.salary = salary;
  }

}
  public class EmployeesRegistered {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("How many employees will be registered? ");
      int numberOfEmployees = sc.nextInt();
      sc.nextLine();
      int count=1;
      int id;
      String name;
      double salary;
      List<Employee> employee = new ArrayList<Employee>();
//      Employee data = new Employee();
      while (numberOfEmployees > 0) {

        System.out.println("Employee #" + count + ":");
        System.out.print("Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        employee.add(new Employee(id,name,salary));
        numberOfEmployees--;
        count+=1;
      }
//      System.out.println(employee);
      System.out.println("Enter the employee id that will have a salary increase: ");
      id = sc.nextInt();

      int finalId = id;

      Object obj = employee.stream().filter(x->x.getId() == finalId).findFirst().orElse(null);
      if (obj != null) {
        System.out.println(obj);
      } else {
        System.out.println("This id does not exist!");
      }
    }
  }

