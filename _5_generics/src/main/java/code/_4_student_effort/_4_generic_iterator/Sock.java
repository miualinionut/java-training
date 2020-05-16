package code._4_student_effort._4_generic_iterator;

public class Sock {
  private int size;
  private String color;

  public Sock(int size, String color) {
    this.size = size;
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Sock{" +
            "size=" + size +
            ", color='" + color + '\'' +
            '}';
  }
}