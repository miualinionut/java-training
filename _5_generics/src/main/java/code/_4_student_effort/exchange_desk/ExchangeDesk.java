package code._4_student_effort.exchange_desk;

import java.util.HashMap;

public class ExchangeDesk {

    public <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toCurrency, double rate) {
        double fromCurrencyUnits = fromCurrency.getUnits();
        T toCurrencyInstance = null;

        try {
            toCurrencyInstance = toCurrency.getDeclaredConstructor().newInstance();
            toCurrencyInstance.setUnits(fromCurrencyUnits * rate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return toCurrencyInstance;
    }


    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON lei = new RON(1_000);
        double rate = 3.20;
        USD dollar = exchangeDesk.convert(lei, USD.class, rate);
        System.out.println(lei + " -> " + dollar);
    }
}
