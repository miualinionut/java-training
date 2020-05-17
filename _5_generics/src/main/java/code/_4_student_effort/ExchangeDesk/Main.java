package code._4_student_effort.ExchangeDesk;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        RON lei = new RON(1000);
        ExchangeDesk<RON,USD> exchangeDesk = new ExchangeDesk<>();

        USD dolari = exchangeDesk.convert(lei,USD.class);
        System.out.println(dolari);


    }
}
