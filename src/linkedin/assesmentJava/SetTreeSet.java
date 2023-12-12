package linkedin.assesmentJava;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Location implements Comparable<Location> {
  private String name;
  public Location(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return name;
  }
  @Override
  public int compareTo(Location loc) {
    return name.compareTo(loc.name);
  }

  static void reverse(String s) {
    if(s.length() <=1 || s == null) {
      System.out.println(s);
    } else {
      System.out.print(s.charAt(s.length()-1));
      reverse(s.substring(0, s.length()-1));
    }
  }
}
public class SetTreeSet {
  public static void main(String[] args) {
    Set<Location> stops = new TreeSet<>();
    stops.add(new Location("stratford"));
    stops.add(new Location("victoria"));
    stops.add(new Location("Stratford"));
    stops.add(new Location("Victoria"));
    System.out.print(stops.size() + "-");
    System.out.println(stops.iterator().next());

    for (Location x : stops){

      System.out.println(x);

    }

    String s = "Ricardo";
    Location.reverse(s);;

    Set<String> attractions = new LinkedHashSet<>();
    attractions.add("Museum of Modern Art");
    attractions.add("Times Square");
    attractions.add("Grand Central Terminal");
    attractions.add("Museum of Modern Art");
    System.out.println(attractions);

  }
}
