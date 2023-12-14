package streamChallengeTwo.application;

import polimorfism.entities.Employee;
import streamChallengeTwo.entities.Employex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados (nome, email e salário)
 * de funcionários a partir de um arquivo em formato .csv.
 * Em seguida mostrar, em ordem alfabética, o email dos
 * funcionários cujo salário seja superior a um dado valor
 * fornecido pelo usuário.
 * Mostrar também a soma dos salários dos funcionários cujo
 * nome começa com a letra 'M'.
 * Execution:
 * Input:-> Enter salary: 2000.00
 * Output:-> Email of people whose salary is more than 2000.00:
 * anna@gmail.com
 * bob@gmail.com
 * maria@gmail.com
 * Sum of salary of people whose name starts with 'M': 4900.00
 */
public class StreamChallengeTwo {
  public static void main(String[] args) {
    String path = "/home/rferreira/dev/javaLearning/employee.csv";

    String line = null;
    List<Employex> listEmployees = new ArrayList<Employex>();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

      while ((line = br.readLine()) != null) {

        String[] lines = line.split(",");
        listEmployees.add(new Employex(lines[0], lines[1], Double.parseDouble(lines[2])));

      }

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter salary: ");
      double salary = sc.nextDouble();

      System.out.println("Email of people whose salary is more than " + String.format("%.2f",salary));

      List<String> email= listEmployees
              .stream()
              .filter(x ->x.getSalary()>salary)
              .map(Employex::getEmail)
              .toList();

      email.forEach(System.out::println);

      double sum = listEmployees
              .stream()
              .filter(x -> x.getName().startsWith("M"))
              .map(Employex::getSalary)
              .reduce(0.0, (x,y) -> x+y);

      System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));

    } catch (FileNotFoundException ex) {
      System.out.println("Error: " + ex.getMessage());
    } catch (IOException ex) {
      System.out.println();
    }
  }
}
