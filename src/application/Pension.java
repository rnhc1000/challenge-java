package application;


import java.util.Arrays;
import java.util.Scanner;

class Register {

  private String nome;
  private String email;
  private int room;

  public int getRoom() {
    return room;
  }

  public void setRoom(int room) {
    this.room = room;
  }

  public Register(){}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Register (String nome, String email, int room) {
    this.nome = nome;
    this.email = email;
    this.room = room;
  }

  @Override
  public String toString() {
    return "Register{" +
            "nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", room=" + room +
            '}';
  }
}
public class Pension {

  public static void main(String[] args) {

    int [] rooms = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o numero de estudantes:");
    int n = sc.nextInt();
    sc.nextLine();

    while (n > 10)  {
      System.out.println("Numero de estudantes maior do que o numero de quartos disponiveis");
      System.out.print("Informe o numero de estudantes novamente:");
      n = sc.nextInt();
      sc.nextLine();
    }
    int m = n;
    String name="";
    String email="";
    int roomNumber;
    Register register = new Register();
    Register [] registros = new Register[rooms.length];
    int count=0;
    int roomsAvailable=0;
    while (m>0) {
      System.out.print("Nome: ");
      name= sc.nextLine();
      System.out.print("Email: ");
      email = sc.nextLine();
      System.out.print("Room #: ");
      roomNumber= sc.nextInt();
      sc.nextLine();
      registros[roomNumber] = new Register(name, email, roomNumber);
      m--;
    }
    for (int d=0; d<registros.length; d++) {
      if (registros[d] != null)
        System.out.println(registros[d]);
    }
  }
}
