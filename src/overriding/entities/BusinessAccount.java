package overriding.entities;

public class BusinessAccount extends Account {

  private Double loanLimit;

  public BusinessAccount(){
    super();
  }

  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  @Override
  public String toString() {
    return "BusinessAccount{" +
            "loanLimit=" + loanLimit +
            '}';
  }
  @Override
  public void withdraw(Double amount) {
    super.withdraw(amount);
    balance -= 2.0;
  }
}
