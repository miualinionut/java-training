package code._4_student_effort.Challenge1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {


    <To extends Currency,From extends Currency > To convert(From toExchange, Class<To> newCurrency, float exchangeRate ){

        To ammount= null;
        try {
            ammount = newCurrency.getDeclaredConstructor().newInstance();
            ammount.setQuantity(toExchange.getQuantity()*exchangeRate);
        } catch (ExchangeException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new ExchangeException(e.getMessage());
        }
        return ammount;

    }

}
