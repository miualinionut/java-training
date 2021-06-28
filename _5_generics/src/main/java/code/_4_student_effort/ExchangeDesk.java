package code._4_student_effort;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeDesk
{
    Map<CurrencyPair<? extends Currency, ? extends Currency>, Double> rates = new HashMap<>();

    public <A extends Currency, B extends Currency> B convert(A givenCurrency, Class<B> convertedCurrencyClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException
    {
        Double exchangeRate = rates.get(new CurrencyPair<>(givenCurrency.getClass(), convertedCurrencyClass));
        if(exchangeRate == null) {
            B negativeCurrency = convertedCurrencyClass.getDeclaredConstructor().newInstance();
            negativeCurrency.setSum(-1);
            return negativeCurrency;
        }

        double convertedSum = givenCurrency.getSum() * exchangeRate;

        B convertedCurrency = convertedCurrencyClass.getDeclaredConstructor().newInstance();
        convertedCurrency.setSum(convertedSum);

        return convertedCurrency;
    }

    public <A extends Currency, B extends Currency> void addRate(Class<A> firstCurrency, Class<B> secondCurrency, double rate) {
        if (rate <= 0) {
            throw new IllegalArgumentException("Rate cannot be zero");
        }
        rates.put(new CurrencyPair<>(firstCurrency, secondCurrency), rate);
        rates.put(new CurrencyPair<>(secondCurrency, firstCurrency), 1 / rate);
    }

}
