package code._4_student_effort.CodeChallange1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();

        Ron lei = new Ron(1_000);
        Usd dollars = exchangeDesk.convert(lei, Usd.class);

        System.out.println(lei);
        System.out.println(dollars);

        exchangeDesk.addRate(Ron.class, Usd.class, 4.1d);
        Usd dollars2 = exchangeDesk.convert(lei, Usd.class);
        Ron lei2 = exchangeDesk.convert(dollars, Ron.class);

        System.out.println(lei2);
        System.out.println(dollars2);
    }
}
