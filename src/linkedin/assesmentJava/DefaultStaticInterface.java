package linkedin.assesmentJava;

interface SMSInterface {
  default void sendMessage() {}
  void deleteMessage();
  static void receiveMessage() {}
}

interface EmailInterface {
  public default void sendMessage() {}
  public void deleteMessage();
  public static void receiveMessage() {}
  public void archiveMessage();
}
public class DefaultStaticInterface implements SMSInterface, EmailInterface{

  @Override
  public void sendMessage() {};
  @Override
  public void deleteMessage() {
    System.out.println("Deleting Message...");
  }
//  @Override
  static void receiveMessage() {}

  @Override
  public void archiveMessage() {}

  public static void main(String[] args) {
    int timer = 10;
    do {
//      int timer = 10;
      do {
        timer--;
      } while (timer>0);
      break;
    } while(true);

    System.out.println(timer);

  }

}
