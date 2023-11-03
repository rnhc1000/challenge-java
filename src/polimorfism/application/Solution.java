package polimorfism.application;

import polimorfism.entities.Employee;
import polimorfism.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<Employee>();
    Scanner sc = new Scanner(System.in);
    System.out.print("How many Employees: ");
    int numberOfEmployees = sc.nextInt();
    sc.nextLine();
    int count=1;
    while (numberOfEmployees > 0 ) {
      System.out.println("Employee # " + count + " data");
      System.out.print("Outsourced Employee?  (Y/N)");
      char ch = sc.next().charAt(0);
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Worked Hours: ");
      Integer hours = sc.nextInt();
      sc.nextLine();
      System.out.print("Value per Hour: ");
      Double workedHour = sc.nextDouble();
      sc.nextLine();

      if (ch == 'y' || ch == 'Y') {
        System.out.print("Inform additional charge: ");
        double additionalCharge = sc.nextDouble();
        Employee emp = new OutsourcedEmployee(name,hours,workedHour,additionalCharge);
        employees.add(emp);
      } else {
        employees.add(new Employee(name, hours, workedHour));
      }
      numberOfEmployees--;
      count++;
    }
    System.out.println("PAYMENTS");
    for (Employee e : employees) {
      String n = e.getName();
      double income = e.payment();
      System.out.println( n +  " - " + "$ " + String.format("%.2f", income));

    }
//    System.out.println(employees);
    sc.close();
  }
}
