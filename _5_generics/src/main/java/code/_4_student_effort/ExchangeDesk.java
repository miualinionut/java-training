package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class ExchangeDesk {

    // we need 2 currencies
    // 1 RON = 4,85 EUR
    //  init  rate  dest_currency

    <T extends Currency, F extends Currency> T convert(F toChange,
                                                       Class<T> toClass,
                                                       double rate) {
        T toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.units = toChange.units * rate;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return toCurrency;
    }
}
