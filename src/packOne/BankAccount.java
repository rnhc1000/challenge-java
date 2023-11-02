package packOne;

import java.util.Scanner;

import static java.lang.String.format;

public class BankAccount {

  private int id;
  private double balance;
  private String holder;

  public BankAccount(int id, String holder) {
    this.id = id;
    this.holder = holder;
  }
  public BankAccount(int id, String holder, double initialDeposit) {
    this.holder = holder;
    this.id = id;
    deposit(initialDeposit);
  }

  public void deposit(double amount) {
    balance+=amount;
  }

  public void withdraw(double amount) {
    balance-=amount + 5.0;
  }
  /**
   *
   * balance can only be changed via deposit/withdrawal
   * so no setBalance();
   * Accounts can not be changed... so no setBankAccount();
   *
   */
  public double getBalance() {
    return balance;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Account: "
            + id
            + ", Holder: "
            + holder
            + ", Balance: $ "
            + String.format("%.2f",balance);
  }
}

