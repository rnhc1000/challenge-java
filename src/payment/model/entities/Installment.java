package payment.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

  private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private Integer installments;
  private LocalDate dueDate;
  private Double amount;

  public Integer getInstallments() {
    return installments;
  }

  public void setInstallments(Integer installments) {
    this.installments = installments;
  }

  public Installment(Integer installments) {
    this.installments= installments;
  }
  public Installment(LocalDate dueDate, Double amount) {
    this.dueDate = dueDate;
    this.amount = amount;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return
            "dueDate=: " + dueDate.format(fmt) +
            ", amount=: " + String.format("%.2f \n",amount);
  }
}
