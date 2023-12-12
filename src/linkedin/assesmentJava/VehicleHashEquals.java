package linkedin.assesmentJava;

import java.util.Objects;

class Vehicle {
  private int VIN;
  private String model, brand;
  int year;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
    if (!(o instanceof Vehicle)) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return VIN == vehicle.VIN;
  }

  @Override
  public int hashCode() {
    return (model + brand).hashCode();
  }
}
public class VehicleHashEquals {
}
