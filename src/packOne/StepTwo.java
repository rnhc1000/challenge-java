package packOne;

import java.util.*;
import java.util.stream.Collectors;

interface Interface1 {
  static void print() {
    System.out.print("Hello");
  }
}

interface Interface2 {
  static void print() {
    System.out.print("World!");
  }
}

class Soma {
  int a;
  int b;

  public int sum(int a, int b) {
    return a + b;
  }
}

class AreaCircle {

  double r;
  double pi;

  public double areaCircle(double r) {
    double pi = Math.PI;
    return pi * Math.pow(r, 2);
  }
}

public class StepTwo implements Interface1, Interface2 {
  public static int sumUp() {
    int z;
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe x: ");
    int x = sc.nextInt();
    System.out.print("Informe y: ");
    int y = sc.nextInt();
    sc.close();
    Soma s = new Soma();
    return z = s.sum(x, y);
  }

  public static double areaCircle() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o raio do circulo: ");
    double raio = sc.nextDouble();
    sc.close();
    AreaCircle area = new AreaCircle();
    return area.areaCircle(raio);
  }

  public static int fourNumbers() {

    int x, y, w, z;

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o valor de x: ");
    x = sc.nextInt();
    System.out.print("Informe o valor de y: ");
    y = sc.nextInt();
    System.out.print("Informe o valor de w: ");
    w = sc.nextInt();
    System.out.print("Informe o valor de z: ");
    z = sc.nextInt();
    sc.close();
    int productOne = x * y;
    int productTwo = w * z;
    return productOne - productTwo;
  }

  public static Map<Integer, Double> func() {

    int id, hoursWorked;
    double salary;

    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o id do empregado: ");
    id = sc.nextInt();
    System.out.print("Informe o numero de horas trabalhadas: ");
    hoursWorked = sc.nextInt();
    sc.close();
    salary = (double) id * hoursWorked;
    Map<Integer, Double> list = new HashMap<Integer, Double>();
    list.put(id, salary);
    return list;
  }

  public static void main(String[] args) {

//    int s = 0;
//    s = sumUp();
//    System.out.println("Soma: " + s);
//    double r;
//    r = areaCircle();
//    System.out.printf("Area do Circulo: %.2f cm2", r);
//    int r = fourNumbers();
//    System.out.println("Diferença: " + r);
    if (args.length != 0) System.out.println(args[2]);
    Map<Integer, Double> x = new HashMap<Integer, Double>();
    x = func();
    Integer id;
    Double salary;
//    System.out.println(x.keySet());
    for (Integer i : x.keySet()) {
      System.out.printf("id: %d, salary: $ %.2f", i, x.get(i));
    }

//    System.out.println(x.get);
    System.out.println();
    Interface1.print();
    System.out.print(" ");
    Interface2.print();
    String str = "abcde";
    String m = str.trim();
    m = str.toUpperCase();
    m = str.substring(3, 4);
    System.out.println(str + " " + m);
    List list = new ArrayList();
    list.add("hello");
    list.add(2);
    for (Object i : list) {
      System.out.println(i);
    }
    System.out.print(list.get(0) instanceof Object);
    System.out.print(list.get(1) instanceof Integer);
    String message = "Hello world!";
    String newMessage = message.substring(6, 12)
            + message.substring(0, 6);
    System.out.println(newMessage);
    List<String> pencil = new ArrayList<>();
    pencil.add("blue");
    pencil.add("red");
    pencil.add("orange");
    pencil.add("yellow");
    pencil.add("orangered");

    for (String s : pencil) {
      System.out.println(s);
    }

    pencil.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
    pencil.sort(Comparator.comparing(String::toString));
    System.out.println(pencil);
    Collections.sort(pencil);
    System.out.println(pencil);
    for (int i=0; i<10; i=i++) {
      i += 1;
      System.out.println("Hello World!");
    }
    Set<Integer> lixt = new LinkedHashSet<>();
    lixt.add(5);
    lixt.add(1);
    lixt.add(10);
    System.out.println(lixt);
    String mexage = "Hello";
    for (int i = 0; i<mexage.length(); i++){
      System.out.print(mexage.charAt(i));
    }
    List<Boolean> llist = new ArrayList<>();
    llist.add(true);
    llist.add(Boolean.parseBoolean("FalSe"));
    llist.add(Boolean.TRUE);
    System.out.println(llist.size());
    System.out.print(llist.get(1) instanceof Boolean);
  }
}



