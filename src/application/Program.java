package application;


import packOne.BankAccount;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    BankAccount account;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account number: ");
    int acc = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter account holder: ");
    String holder = sc.nextLine();
    System.out.print("Is there any initial deposit (Y/N)? ");
    char answer = sc.next().charAt(0);
    double deposit=0;
    if (answer == 'Y' || answer =='y') {
      System.out.print("Inform the amount of deposit: ");
      deposit = sc.nextDouble();
    }
    account = new BankAccount(acc,holder,deposit);

    System.out.println("Account data:");
    System.out.printf("Account: %d Holder: %s Balance: %.2f", account.getId(), account.getHolder(), account.getBalance());

    System.out.println();
    System.out.print("Enter a deposit value: ");
    double depositValue = sc.nextDouble();
    account.deposit(depositValue);
    System.out.println("Updated account data: ");
    System.out.println(account);
    System.out.println();
    System.out.print("Enter a withdrawal value: ");
    double withdrawValue = sc.nextDouble();
    account.withdraw(withdrawValue);
    System.out.println("Updated account data: ");
    System.out.println(account);
    sc.close();

  }
}
