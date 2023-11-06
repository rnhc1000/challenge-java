package setInterfacesOne.application;

import setInterfacesOne.entities.RegisterAccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Path: ");
    String path = sc.nextLine();
    sc.close();
    int count=0;
    DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE_TIME;
    Set<RegisterAccess> set = new HashSet<RegisterAccess>();
    try(BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = null;
      while ((line = br.readLine())!= null){
        String[] lines = line.split(" ");
        set.add(new RegisterAccess(lines[0], LocalDateTime.parse(lines[1], fmt)));
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e) {
      System.out.println();
    }
    System.out.println(set.size() + " users");
    for (RegisterAccess r : set) {
      System.out.println(r);
    }
  }
}
