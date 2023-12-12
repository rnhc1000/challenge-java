package linkedin.assesmentJava;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Transcript<T extends Collection> {
  T course;
  public void completed(T courses) {
    System.out.println("Completed: " + courses.size() + " courses");
  }

}
public class CollectionGeneric {
  public static void main(String[] args) {
    Transcript<List> courses = new Transcript<List>();
    courses.completed(Arrays.asList("Spring MVC", "Spring Boot"));
  }
}
