package abstraction.entities;

public class Juridica extends Contribuinte{
  private Integer numberOfEmployees;
  public Juridica(){}

  public Juridica(String name, Double annualIncome, Integer numberOfEmployees) {
    super(name, annualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public Integer getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public Double taxToPay() {
    if (numberOfEmployees > 10) {
      return getAnnualIncome() * 0.14;
    } else {
      return getAnnualIncome() * 0.16;
    }
  }
}
