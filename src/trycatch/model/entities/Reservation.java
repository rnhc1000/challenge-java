package trycatch.model.entities;

import trycatch.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
  private Integer roomNumber;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  public Reservation(){}
  public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
    if (!checkOut.after(checkIn)) {
      throw new DomainException("date must be after ckeckin date!");
    }
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Date getCheckIn() {
    return checkIn;
  }



  public Date getCheckOut() {
    return checkOut;
  }

  @Override
  public String toString() {
    return "Room "
            + roomNumber
            + ", "
            + "check-in: "
            + formatter.format(checkIn)
            + ", check-out: "
            + formatter.format(checkOut)
            + ", "
            + duration()
            + " nights";
  }

  public long duration() {

    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  /**
   *
   * @param checkIn
   * @param checkOut
   * update checkin and checout values of the object
   * this.checkIn = checkIn as argument...
   */
  public void updateDates(Date checkIn, Date checkOut) throws DomainException {
    Date now = new Date();
    if (checkIn.before(now) || checkOut.before(now)) {
      throw new DomainException("Reservation dates for update must be future dates!");
    }
    if (!checkOut.after(checkIn)) {
      throw new DomainException("date must be after ckeckin date!");
    }
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

}
