package packOne;

/**
 * toLowerCase(), toUpperCase(), trim() - formatting
 * substring(start), substring(start,end) - cut
 * Replace(char,char), Replace(string,string)
 * IndexOf(), LastIndexOf() - search
 * str.Split("")
 */
public class StepThree {

  public static void main(String[] args) {
    String original = "abcde FGHI ABC abc DEFG -  ";
    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(15, 25);
    String s06 = original.replace('a','x');
    String s07 = original.replace("abc", "xyz");
    System.out.println(original);
    System.out.println(s01);
    System.out.println(s02);
    System.out.println(s03);
    System.out.println(s04);
    System.out.println(s05);
    System.out.println(s06);
    System.out.println(s07);
    String regex = "\\s";
    int i = original.indexOf("FG");
    int j = original.lastIndexOf("FG");
    System.out.println(i + " " + j);

    String s = "The quick brown fox dog jumps over the lazy dog";

    String [] v = s.split(" ");

    for (String a : v) {
      System.out.print(a + " ");
    }


  }
}
