package setInterfaceTwo.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> set = new HashSet<Integer>();
    int id =0;
    char c = 'A';
    for (int i=0;i<3;i++){
      System.out.print("how many students for course " + c + ": ");
      int students = sc.nextInt();
      while (students > 0) {
        id = sc.nextInt();
        set.add(id);
        students--;
      }
      c+=1;
    }
    System.out.println("Students: " + set.size());
//    for (Integer g : set){
//      System.out.println(g);
//    }
  }
}
