package packOne;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {

  public static boolean containDuplicates (int [] arr) {
    List<Integer> set = new ArrayList<>();
    int len = arr.length;

    for (int j=0; j<len;j++) {
      if(set.contains(arr[j])) {
        continue;
      } else {
        set.add(arr[j]);
      }
    }

    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    for (Integer x : set) {
      if (x % 2 == 0) {
        Integer i = x * 2;
        even.add(i);
      } else {
        odd.add(x);
      }
    }

    System.out.println(even);
    List<Integer> od = new ArrayList<>(odd);
    System.out.println(Arrays.toString(arr));

    return false;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,4,5,6, 10,12, 9, 15,5,6,7,8,9,8,7,6};

    containDuplicates(arr);


  }
}
