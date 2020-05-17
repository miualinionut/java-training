package code._4_student_effort.ExchangeDesk;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk<T extends Money, V extends Money> {

  //  private T inputValue;
    //private V exchangedValue;

    public ExchangeDesk(){
    }

    public V convert(T input, Class<V> toChange)  {
        try {
           V result = toChange.getDeclaredConstructor().newInstance();
            result.setValue(input.divideBy(4.5));
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExchangeException(e.getMessage());
        }

    }
}
