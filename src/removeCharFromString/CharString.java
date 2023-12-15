package removeCharFromString;
/**
 * Eliminate a certain character from a string
 * without using remove() or replace()
 */

import java.util.Arrays;
import java.util.Scanner;

public class CharString {
  public static void main(String[] args)throws Exception{
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a frase desejada: ");
    String s = input.nextLine();
    System.out.print("Qual caracter deseja eliminar: ");
//    char givenChar = input.next().charAt(0);
    char givenChar = input.next(".").charAt(0);
    boolean checkBlank = s.isBlank();

    try {
      if (checkBlank)  {
        throw new NullPointerException();
      }

    } catch (NullPointerException ex) {
      System.out.println("String can't be null");
    }

    char[] stringToChar = s.toCharArray();
    StringBuilder str = new StringBuilder();
    long start = System.currentTimeMillis();
    for (char c : stringToChar){
      if (c == givenChar) {
         continue;
      }
      str.append(c);
    }
    System.out.print(str);
    long end = System.currentTimeMillis();
    System.out.print("\nProcess took: " + (end-start) + " ms");
    input.close();
  }
}
