package application;

import java.util.Arrays;
import java.util.Scanner;

class Pessoa {
  private String name;
  private int age;
  private double height;
  public Pessoa() {
  }
  public Pessoa(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height =height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", height=" + height +
            '}';
  }

}

class Minors {
  private String name;
  private int age;

  private double height;
  public Minors() {

  }
  public Minors(String name, int age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
public class NomeIdadeAltura {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas digitadas: ");
    int n = sc.nextInt();
    Pessoa[] pessoas = new Pessoa[n];
    int m = 0;
    int count = 1;
    sc.nextLine();
    String nome;
    int idade;
    double altura;
    while (n > 0 ) {
      System.out.print("Dados da " + count + "a Pessoa \n");
      System.out.print("Nome: ");
      nome = sc.nextLine();
      System.out.print("Idade: ");
      idade = sc.nextInt();
      sc.nextLine();
      System.out.print("Altura: ");
      altura = sc.nextDouble();
      sc.nextLine();
      pessoas[m] = new Pessoa(nome, idade, altura);
      n--;
      count++;
      m++;
    }
    ;
    System.out.println(Arrays.toString(pessoas));
    double avgHeight=0.0;
    double menores = 0;
    int c = 0;
    int len = pessoas.length;
    for (int i=0; i<len; i++) {
      avgHeight += pessoas[i].getHeight();
      if (pessoas[i].getAge() < 16) {
        menores+=1;
        c+=1;
      }
    }
    String [] minorsNames = new String[c];
    System.out.println("Numero: " + len);
    System.out.printf("Altura Media: %.2f\n", avgHeight/pessoas.length);
    double numberMinors =  (menores/len)*100;
    System.out.println("M " + numberMinors);
    System.out.printf( "%.0f", (menores/len)*100);

    System.out.println("Menores: " + menores);


  }
}
