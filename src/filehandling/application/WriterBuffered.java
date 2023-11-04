package filehandling.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterBuffered {
  public static void main(String[] args) {
    String path = "/home/rferreira/dev/javaLearning/out.txt";
    String [] lines = new String[] {"Good Morning", "Good Afternoon", "Good Evening"};

    try (BufferedWriter bw = new BufferedWriter((new FileWriter(path, true)))) {

      for (String line : lines) {

        bw.write(line);
        bw.write("\n");
        bw.newLine();

      }

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
