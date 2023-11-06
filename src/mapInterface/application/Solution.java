package mapInterface.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    String path = "/home/rferreira/dev/javaLearning/ballot.csv";
    Map<String, Integer> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = null;
      while ((line = br.readLine()) != null) {
        String [] lines = line.split(",");
        String key = lines[0];
        int value = Integer.parseInt(lines[1]);
        //System.out.println(Arrays.toString(lines));
        if (map.containsKey(key)) {
          value+=map.get(key);
        }
        map.put(key, value);
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (IOException e){
      System.out.println();
    }
    for (String key : map.keySet() ) {
      System.out.println(key + ": " + map.get(key));
    }
//    Map<String, String> cookies = new TreeMap<>();
//
//    cookies.put("username", "Maria");
//    cookies.put("email", "maria@gmail.com");
//    cookies.put("phone", "999919999");
//    for (String key : cookies.keySet()) {
//      System.out.println(key + ": " + cookies.get(key));
//    }
//    System.out.println(cookies);
//    cookies.remove("phone");
//    System.out.println(cookies);
  }
}
