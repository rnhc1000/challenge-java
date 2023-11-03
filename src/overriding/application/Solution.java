package overriding.application;

import overriding.entities.Account;
import overriding.entities.BusinessAccount;
import overriding.entities.SavingsAccount;

public class Solution {

  public static void main(String[] args) {

    Account acc = new Account(1001, "Ricardo", 1000.0);
    acc.withdraw(900.00);
    SavingsAccount scc = new SavingsAccount(1002, "Ricardo", 1000.0, 1.05);
    System.out.println(acc.getBalance());
    scc.withdraw(100.0);
    System.out.println(scc.getBalance());
    BusinessAccount bcc = new BusinessAccount(1003, "Ricardo", 1000.0, 1000.0);
    bcc.withdraw(20.0);
    System.out.println(bcc.getBalance());
  }
}
