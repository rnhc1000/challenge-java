package packOne;

class Account {

  double balance;
  String holder;
  final int id;
  double deposit;
  double withdrawal;
  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public double getWithdrawal() {
    return withdrawal;
  }

  public void setWithdrawal(double withdrawal) {
    this.withdrawal = withdrawal;
  }
  
  Account(int id) {

    this.id = id;
  }
  Account(double balance, String holder, int id) {
    this.balance = balance;
    this.holder = holder;
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
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

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Account{" +
            "balance=" + balance +
            ", holder='" + holder + '\'' +
            ", id=" + id +
            ", deposit=" + deposit +
            ", withdrawal=" + withdrawal +
            '}';
  }
}
public class BankAccount {
}
