package abstraction.application;

import abstraction.entities.Contribuinte;
import abstraction.entities.Fisica;
import abstraction.entities.Juridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    List<Contribuinte> taxPayers = new ArrayList<Contribuinte>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of tax payers: ");
    Integer numberOfTaxPayers = sc.nextInt();
    sc.nextLine();
    int count = 1;

    while (numberOfTaxPayers > 0) {

      System.out.print("Tax Payer #" + count + "data:\n");
      System.out.print("Individual or Company? (i/c): ");
      char ch = sc.next().charAt(0);
      sc.nextLine();
      if (ch == 'i') {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Annual Income: ");
        Double income = sc.nextDouble();
        System.out.print("Health Expenditures: ");
        Double healthExpenses = sc.nextDouble();
        taxPayers.add(new Fisica(name, income,healthExpenses));
      } else if (ch == 'c') {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Annual Income: ");
        Double income = sc.nextDouble();
        System.out.print("Number of Employees: ");
        Integer employees = sc.nextInt();
        sc.nextLine();
        taxPayers.add(new Juridica(name,income,employees));
      }
      numberOfTaxPayers--;
      count++;
    }
    System.out.println(taxPayers);
    System.out.println("TAX PAYERS");
    for (Contribuinte c : taxPayers){
      System.out.printf(c.getName() +":" + " $" + String.format("%.2f", c.taxToPay()) +"\n");
    }
  }
}
