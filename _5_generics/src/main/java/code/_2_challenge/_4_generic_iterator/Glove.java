package code._2_challenge._4_generic_iterator;

public class Glove {
  private int size;
  private String color;

  public Glove(int size, String color) {
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
    return "Glove{" +
            "size=" + size +
            ", color='" + color + '\'' +
            '}';
  }
}