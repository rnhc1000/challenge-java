package inheritance.application;

import inheritance.entities.Account;
import inheritance.entities.BusinessAccount;

public class Solution {

  public static void main(String[] args) {
     Account acc = new Account(1001, "Alex", 0.0);
     BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
     //UPCASTING - subClass -> SuperClass
     Account acc1 = bacc;
     Account acc2 = new BusinessAccount(1003,
             "Ricardo",
             0.0,
             200.0);
     Account acc3 = new BusinessAccount(1004,
             "Perpetua",
             0.0,
             200.0);

    System.out.println(acc3.getHolder());
    //DOWNCASTING - superClass -> subClass
    BusinessAccount  bcc = (BusinessAccount) new Account(1001,"alex", 0.0);
    bcc.loan(100.0);
  }
}
