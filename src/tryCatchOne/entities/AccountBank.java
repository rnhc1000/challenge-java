package tryCatchOne.entities;

import tryCatchOne.exceptions.DomainExceptions;

public class AccountBank {
  private Integer number;
  private String holder;
  private Double balance;
  private Double withdrawLimit;

  public AccountBank() {

  }

  public AccountBank(Integer number, String holder, Double balance, Double withdrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Double getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }

  public void deposit(Double amount) {
    balance += amount;
  }

  public void withdraw(Double amount) throws DomainExceptions {
    if (amount > getWithdrawLimit()) {
      throw new DomainExceptions("The amount exceeds the withdraw limit");
    }
    if (amount > getBalance()) {
      throw new DomainExceptions("Not enough balance");
    }
    balance -= amount;
  }

  @Override
  public String toString() {
    return "AccountBank{" +
            "number=" + number +
            ", holder='" + holder + '\'' +
            ", balance=" + balance +
            ", withdrawLimit=" + withdrawLimit +
            '}';
  }
}
