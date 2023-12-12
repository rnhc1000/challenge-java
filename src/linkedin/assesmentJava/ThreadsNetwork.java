package linkedin.assesmentJava;

class Server extends Thread {
  Thread thread;
  String threadName;

  Server(String threadName) {
    this.threadName = threadName;
    thread = new Thread(this, this.threadName);
    thread.start();
  }
  public void run() {}
}
public class ThreadsNetwork {
  public static void main(String[] args) {
    Server server = new Server("ServerOne");
    try {
      server.thread.wait();
      System.out.println(server.thread.isAlive());
    } catch (IllegalMonitorStateException ims) {
      System.out.println("Illegal monitor state");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
