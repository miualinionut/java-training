package code._2_challenge._1_exchange_desk;

import java.util.ArrayList;

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
