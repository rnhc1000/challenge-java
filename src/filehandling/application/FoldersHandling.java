package filehandling.application;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FoldersHandling {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a folder path: ");
    String strPath = sc.nextLine();

    File path = new File(strPath);

    File[] folders = path.listFiles(File::isDirectory);
    for (File f : folders) {
      System.out.println(f);
    }
    File [] files = path.listFiles(File::isFile);
    for (File g : files){
      System.out.println(g);
    }
    boolean success = new File(strPath + "/DEV").mkdir();
    System.out.println(success);
    sc.close();

    System.out.println("getName: " + path.getName());
    System.out.println("getParent: " + path.getParent());
    System.out.println("getPath: " + path.getPath());
  }
}
