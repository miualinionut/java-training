package code._4_student_effort._1_exchangeDesk;

public class ExchangeDesk {
    <T extends Currency, F extends Currency> T convert(F from, Class <T> toClass, double rate){
        T to = null;
        try{
            to = toClass.getDeclaredConstructor().newInstance();
            to.setUnits(from.getUnits() * rate);
        } catch(Exception e) {
        }

        return to;
    }
}
