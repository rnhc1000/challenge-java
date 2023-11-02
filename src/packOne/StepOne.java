package packOne;

import java.util.Locale;
import java.util.Scanner;

/**
 * <tipo> <nome> = <valor Inicial>
 *   int age = 25
 *   double altura = 1.68 (64bits)
 *   char sexo = 'F' (16bits) '\u0000'
 *   byte asd = '-128 - 127' - 8bits
 *   short a = -32768 a 32768
 *   long x = 64 bits.... 0L
 */
public class StepOne {
  public static void main(String[] args) {

    double x = 10.35784;
    System.out.println(x);
    System.out.printf("%.2f\n", x);
    System.out.printf("%.4f\n", x);
    System.out.printf("%.4f\n", x);
    Locale.setDefault(Locale.KOREA);
    System.out.printf("%.2f\n", x);
    System.out.printf("O resultado = %.2f\n", x);

    String p1 = "Computer";
    String p2 = "Office desk";

    int age = 30;
    int code = 5250;
    char gender = 'F';

    double prOne = 2100.0;
    double prTwo = 650.50;
    double prThree = 53.432367;

    System.out.println("Products");
    System.out.printf("%s, which price is $ %.2f\n", p1, prOne);
    System.out.printf("%s, which price is $ %.2f\n", p2, prTwo);
    System.out.println();
    System.out.printf("Record: %d years old, code %d and gender: %c\n", age, code, gender);
    System.out.println();
    System.out.printf("Measure with eight decimal places: %.8f\n", prThree);
    System.out.printf("Rounded (three decimal places) %.3f", prThree);
    System.out.println();
    System.out.printf("US decimal point: %.3f\n", prThree);

    int z = 8;
    int y = 5;

    double r = (double) z / y;
    System.out.println(r);
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe x: ");
    Locale.setDefault(Locale.FRANCE);
    x = sc.nextDouble();
    System.out.print(x);
    sc.close();
  }
}
