package composition.application;

import composition.entities.Department;
import composition.entities.Worker;
import composition.entities.WorkerLevel;
import composition.services.HourContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) throws ParseException {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter department's name:");
    String departmentName = sc.nextLine();
    System.out.print("Enter worker data: \n");
    System.out.print("Name: ");
    String workerName = sc.nextLine();
    System.out.print("Level: ");
    String level = sc.nextLine();
    System.out.print("Base Salary: ");
    Double baseSalary = sc.nextDouble();

    workerName=workerName.toUpperCase();
    level = level.toUpperCase();
    departmentName= departmentName.toUpperCase();

    System.out.print("How many contracts to this worker: ");
    int hours = sc.nextInt();
    sc.nextLine();
    Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
    HourContract cnt = new HourContract();

    for (int i=1; i<=hours;i++) {

      System.out.println("Enter contract #"+i+ " data:");
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = formatter.parse(sc.nextLine());
      System.out.print("Value per Hour: ");
      double perHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      int h = sc.nextInt();
      sc.nextLine();

      HourContract contract = new HourContract(contractDate, perHour, h);
      worker.addContract(contract);
    }
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.nextLine();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));
    sc.close();
  }
}
