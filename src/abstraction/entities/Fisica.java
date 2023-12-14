package abstraction.entities;

public class Fisica extends Contribuinte {
  private Double healthcareExpenses;

  public Fisica(){
    super();
  }

  public Fisica(String name, Double annualIncome, Double healthcareExpenses) {
    super(name, annualIncome);
    this.healthcareExpenses = healthcareExpenses;
  }

  public Double getHealthcareExpenses() {
    return healthcareExpenses;
  }

  public void setHealthcareExpenses(Double healthcareExpenses) {
    this.healthcareExpenses = healthcareExpenses;
  }

  @Override
  public Double taxToPay() {
    double income = getAnnualIncome();
    double taxPaid = 0.0;
    if( income > 20000.00 ){
      return income * 0.25 - getHealthcareExpenses()/2;
    } else {
      return income * 0.15 - getHealthcareExpenses()/2;
    }
  }

  @Override
  public String toString() {
    return "Fisica{" +
            "healthcareExpenses=" + healthcareExpenses +
            '}';
  }
}
