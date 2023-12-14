package abstraction.entities;

public abstract class Contribuinte {
  private String name;
  private Double annualIncome;

  public Contribuinte() {
  }

  public Contribuinte(String name, Double annualIncome) {
    this.name = name;
    this.annualIncome = annualIncome;
  }

  public abstract Double taxToPay();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getAnnualIncome() {
    return annualIncome;
  }

  public void setAnnualIncome(Double annualIncome) {
    this.annualIncome = annualIncome;
  }
}
