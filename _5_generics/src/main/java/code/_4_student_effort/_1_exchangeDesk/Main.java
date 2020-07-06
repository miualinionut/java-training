package code._4_student_effort._1_exchangeDesk;

import code._2_challenge._1_exchange_desk.Ron;
import code._2_challenge._1_exchange_desk.Usd;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchange = new ExchangeDesk();
        RON lei = new RON(1_000);
        USD dollar = exchange.convert(lei, USD.class, 0.24);
    }
}
