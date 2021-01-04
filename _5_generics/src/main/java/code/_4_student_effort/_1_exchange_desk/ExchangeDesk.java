package code._4_student_effort._1_exchange_desk;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeDesk {

    Map<Class<?>, Map<Class<?>, Double>>Rates = new HashMap<>(); //Using a map as a Pair

    public <B extends Currency, C extends Currency> void addRate(Class<B> base, Class<C> toRate, double rate){
        //Add base -> toRate Rate
        Map<Class<?>, Double> unitRatePair = null;
        if(Rates.containsKey(base)){
            unitRatePair = Rates.get(base);
        }

        if(unitRatePair == null){
            unitRatePair = new HashMap<>();
        }
        unitRatePair.put(toRate, rate);

        if(!Rates.containsKey(base)) {
            Rates.put(base, unitRatePair);
        }
        else {
            Rates.replace(base, unitRatePair);
        }

        //Add toRate -> base Rate ( = 1/rate)

        unitRatePair = new HashMap<>();
        unitRatePair.put(base, 1/rate);
        if(!Rates.containsKey(toRate)) {
            Rates.put(toRate, unitRatePair);
        }
        else{
            Rates.replace(toRate, unitRatePair);
        }
    }
    public <B extends Currency, C extends Currency> C convert(B base, Class<C> newBase)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        C conversionResult = newBase.getDeclaredConstructor().newInstance();
        conversionResult.setAmount(base.amount);

        if(Rates.containsKey(base.getClass())) {
           try{ //Not the best option but still
               conversionResult.setAmount(base.amount * Rates.get(base.getClass()).get(newBase));
           }
           catch (Exception e){
               return conversionResult;
           }
        }

        return conversionResult;
    }
}
