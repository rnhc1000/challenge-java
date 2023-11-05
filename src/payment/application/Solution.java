package payment.application;

import org.w3c.dom.ls.LSOutput;
import payment.model.entities.Contract;
import payment.model.entities.Installment;
import payment.model.services.ContractService;
import payment.model.services.PayPalService;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre os dados do contrato: ");
    System.out.print("Numero: ");
    Integer number = sc.nextInt();
    sc.nextLine();
    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
    System.out.print("Valor do contrato: ");
    Double amount = sc.nextDouble();
    System.out.print("Entre com o numero de parcelas: ");
    Integer installments = sc.nextInt();
    sc.nextLine();

    Contract contract = new Contract(number, date, amount);
    System.out.println("Parcelas");
    List<Installment> list = new ArrayList<>();

    ContractService service  = new ContractService(new PayPalService());
    list=service.processContract(contract, installments);

    for (Installment l : list)    {
      System.out.println(l);
    }
    sc.close();
  }
}
