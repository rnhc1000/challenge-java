package composition.entities;

import composition.services.HourContract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker(String workerName, WorkerLevel workerLevel, Double baseSalary, String departmentName) {

  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void setContracts(List<HourContract> contracts) {
    this.contracts = contracts;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getSalary() {
    return baseSalary;
  }

  public void setSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  @Override
  public String toString() {
    return "Worker{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", baseSalary=" + baseSalary +
            ", department=" + department +
            '}';
  }

  public void addContract(HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  public double income(int year, int month) {

    double sum = baseSalary;
    Calendar calendar = Calendar.getInstance();
    for (HourContract c: contracts) {

      calendar.setTime(c.getDate());
      int c_year = calendar.get(Calendar.YEAR);
      int c_month = 1+calendar.get(Calendar.MONTH);
      if(year == c_year && month == c_month) {
        sum += (c.totalValue());
      }

    }
    return sum;
  }
}
