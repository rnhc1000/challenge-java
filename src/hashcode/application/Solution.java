package hashcode.application;

import hashcode.entities.Client;

public class Solution {
  public static void main(String[] args) {
    Client c1 = new Client("Maria", "maria@gmail.com");
    Client c2 = new Client("Maria", "maria@gmail.com");

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));
    System.out.println(c1==c2);
    String s1 = "Maria";
    String s2 = "Maria";
    System.out.println(s1 == s2);
    String s3 = new String("Maria");
    String s4 = new String("Maria");
    System.out.println(s3 == s4);
    /**
     -495238894
     -495238894
     true
     false .... different references
     true ... spring pool area in heap keeps only one copy.
     false... different instantiated objects
     *
     */
  }
}
