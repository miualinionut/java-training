package code._2_challenge._3_proxy;

public class Apartment {
  private final String location;
  private final int monthlyRentCost;

  public Apartment(String location, int monthlyRentCost) {
    this.location = location;
    this.monthlyRentCost = monthlyRentCost;
  }

  public String getLocation() {
    return location;
  }

  public int getMonthlyRentCost() {
    return monthlyRentCost;
  }

  @Override
  public String toString() {
    return "Apartment{" +
            "location='" + location + '\'' +
            ", monthlyRentCost=" + monthlyRentCost +
            '}';
  }
}
