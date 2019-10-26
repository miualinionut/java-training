package code._2_challenge._1_exchange_desk;

public class ExchangeDesk {

  <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toClass, double rate) {
    T toCurrency = null;
    try {
      toCurrency = toClass.getDeclaredConstructor().newInstance();
      toCurrency.setUnits(fromCurrency.getUnits() * rate);
    } catch (Exception e) {
      throw new ExchangeDeskConversionException(e.getMessage());
    }
    return toCurrency;
  }
}
