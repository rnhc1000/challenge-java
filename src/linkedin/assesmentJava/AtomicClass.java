package linkedin.assesmentJava;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicClass {

  private static AtomicBoolean isActive = new AtomicBoolean();
  private Object lock = new Object();
  public synchronized boolean isActiveV1 (boolean newValue) {
    return isActive.getAndSet(newValue);
  }

  public static synchronized boolean isActiveV2(boolean expectedValue) {
    return isActive.compareAndSet(expectedValue, newValue);
  }

  public boolean isActiveV3(boolean newValue) {
    synchronized (lock) {
      return isActive.getAndSet(false);
    }
  }
}
