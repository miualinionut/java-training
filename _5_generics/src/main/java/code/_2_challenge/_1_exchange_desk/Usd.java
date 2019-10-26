package code._2_challenge._1_exchange_desk;

public class Usd extends Currency {

  public Usd() {
  }

  public Usd(double units) {
    super(units);
  }

  public double dollars() {
    return super.getUnits();
  }

  @Override
  public String toString() {
    return dollars() + " USD";
  }
}
