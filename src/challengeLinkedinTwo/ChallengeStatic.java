package challengeLinkedinTwo;

public class ChallengeStatic {
  static int start = 2;
  final int end;
  public ChallengeStatic(int x) {
    x = 4;
    end = x;
  }

  public void fly(int distance) {
    System.out.print(end - start + " ");
    System.out.print(distance);
  }

  public static void main(String... start) {
//    int s = Integer.parseInt(start);
    new ChallengeStatic(10).fly(5);

  }

}
