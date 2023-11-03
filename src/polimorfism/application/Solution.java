package polimorfism.application;

import polimorfism.entities.Employee;

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
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Worked Hours: ");
      Integer hours = sc.nextInt();
      sc.nextLine();
      System.out.print("Value per Hour: ");
      Double workedHour = sc.nextDouble();
      sc.nextLine();
      employees.add(new Employee(name, hours, workedHour));
      numberOfEmployees--;
      count++;
    }
    for (Employee e : employees) {
      String n = e.getName();
      double income = e.getHours() * e.getValuePerHour();
      System.out.println( n +  " - " + "$ " + income);

    }
//    System.out.println(employees);
  }
}
