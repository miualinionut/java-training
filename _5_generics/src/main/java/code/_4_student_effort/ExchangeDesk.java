package code._4_student_effort;

import java.util.Currency;

public class ExchangeDesk {

    <T extends Currency, F extends Currency> Usd convert(Ron fromCurrency, Class<Usd> toClass, double rate) {
        Usd toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.setUnits(fromCurrency.getUnits() * rate);
        } catch (Exception e) {
            throw new ExchangeDeskConversionException(e.getMessage());
        }
        return toCurrency;
    }
}
