package setInterfacesOne.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class RegisterAccess implements Comparable<RegisterAccess> {
  private String name;
  private LocalDateTime time;

  public RegisterAccess(String name, LocalDateTime time) {
    this.name = name;
    this.time = time;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  @Override
  public int compareTo(RegisterAccess registerAccess) {
    return 0;
  }

  @Override
  public String toString() {
    return "RegisterAccess{" +
            "name='" + name + '\'' +
            ", time=" + time +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisterAccess that = (RegisterAccess) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
