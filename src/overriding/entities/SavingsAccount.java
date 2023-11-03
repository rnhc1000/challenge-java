package overriding.entities;

public final class SavingsAccount extends Account {
  private Double interestRate;

  public SavingsAccount(){}

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  @Override
  public String toString() {
    return "SavingsAccount{" +
            "interestRate=" + interestRate +
            '}';
  }

  public void updateBalance() {
    balance += balance * interestRate;
  }

  @Override
  public void withdraw(Double amount) {

    balance -= amount;
  }
}
