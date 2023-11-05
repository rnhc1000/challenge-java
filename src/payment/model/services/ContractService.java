package payment.model.services;

import payment.model.entities.Contract;
import payment.model.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {


private final OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public List<Installment> processContract(Contract contract, Integer months){
    Double totalValueInstalled = contract.getTotalValue() / months;

    List<Installment> install = new ArrayList<>();
    for (int i=1; i<=months; i++) {
      LocalDate dueDate = contract.getDate().plusMonths(i);
      Double interest = onlinePaymentService.interest(totalValueInstalled, i);
      Double fee = onlinePaymentService.paymentFee(totalValueInstalled + interest);
      Double total = totalValueInstalled + fee + interest;
      install.add(new Installment(dueDate, total));
    }
    return install;
  }
}
