package tryCatchOne.application;

import tryCatchOne.entities.AccountBank;
import tryCatchOne.exceptions.DomainExceptions;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter account data: \n");
    System.out.print("Number: ");
    Integer number = sc.nextInt();
    sc.nextLine();
    System.out.print("Holder: ");
    String name = sc.nextLine();
    System.out.print("Initial balance: ");
    Double deposit = sc.nextDouble();
    System.out.print("Withdraw Limit: ");
    Double limit = sc.nextDouble();
    System.out.println();
    AccountBank account = new AccountBank(number, name, deposit,limit);

    System.out.print("Enter amount for withdraw: ");
    Double withdraw = sc.nextDouble();
    try {
      account.withdraw(withdraw);
    } catch (DomainExceptions e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }

  }
}
