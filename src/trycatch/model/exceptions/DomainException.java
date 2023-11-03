package trycatch.model.exceptions;

public class DomainException extends Exception{

    private static final long serialVersionUUID = 1L;

  /**
   * Instantiate the DomainException
   * class
   * passing a msg as an argument
   * @param msg
   */
  public DomainException(String msg) {
      super(msg);
    }
}
