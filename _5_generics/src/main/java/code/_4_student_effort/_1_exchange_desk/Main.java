package code._4_student_effort._1_exchange_desk;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ExchangeDesk excDsk = new ExchangeDesk();
        excDsk.addRate(Ron.class, Usd.class, 0.25d);
        excDsk.addRate(Ron.class, Eur.class, 0.195d);

        Ron lei = new Ron(1000);
        Usd dolari = excDsk.convert(lei, Usd.class);
        Eur euro = excDsk.convert(lei, Eur.class);
        System.out.println("$ " + dolari.amount);
        System.out.println("E " + euro.amount);
    }
}
