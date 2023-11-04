package filehandling.application;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingBuffered {
  public static void main(String[] args) {
//  public static void main(String[] args) throws IOException {
    String path = "/home/rferreira/dev/javaLearning/balanceVSP-10.csv";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {

      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
  }
}
