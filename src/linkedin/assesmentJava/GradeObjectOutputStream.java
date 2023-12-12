package linkedin.assesmentJava;

import java.io.*;

public class GradeObjectOutputStream implements Serializable {
  private int numOfStudents = 15;
  private String subject = "No data";

  public GradeObjectOutputStream() {
    this.numOfStudents = 17;
    this.subject = "Literature";
  }

  public static void main(String[] args) throws Exception {

    try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("enrollment.txt"))) {
      GradeObjectOutputStream grade = new GradeObjectOutputStream();
      grade.numOfStudents = 11;
      grade.subject = "Biology";
      output.writeObject(grade);
    }

    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("enrollment.txt"))) {
      GradeObjectOutputStream grade = (GradeObjectOutputStream) input.readObject();
      System.out.println(grade.subject + "-" + grade.numOfStudents);
    }

  }
}
