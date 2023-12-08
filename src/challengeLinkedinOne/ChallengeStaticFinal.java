package challengeLinkedinOne;

public class ChallengeStaticFinal {

  static int nemesisRaids = 0;

  public static void main(String[] args) {
    Zombie zombie=() -> System.out.println("Graw: " + nemesisRaids++);
    System.out.println("NemesisRaids: " + nemesisRaids);

    Nemesis nemesis = new Nemesis() {
      public void shoot() {
        shoots = 23;
      }
    };

    Zombie.zombie.shoot();
    zombie.shoot();
    nemesis.shoot();
    System.out.println("Nemesis shoots: " + nemesis.shoots + " raids: " + nemesisRaids );

  }
}

@FunctionalInterface
interface Zombie {
  Zombie zombie = () -> System.out.println("Stars!!!");
  void shoot();
}

abstract class Nemesis implements Zombie {
  public int shoots = 5;
}
