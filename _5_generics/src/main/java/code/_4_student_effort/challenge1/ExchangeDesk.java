package code._4_student_effort.challenge1;



import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {

    <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toClass) {
        T toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.setUnits(fromCurrency.getUnits() * 0.256);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return toCurrency;
    }
}
