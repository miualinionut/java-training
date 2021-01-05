package code._4_student_effort.challenge1;



public class main1 {

    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron lei = new Ron(1000);
        Usd dollar = exchangeDesk.convert(lei, Usd.class);
        System.out.println(dollar.toString());
    }
}
