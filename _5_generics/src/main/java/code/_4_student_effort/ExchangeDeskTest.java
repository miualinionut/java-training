package code._4_student_effort;

public class ExchangeDeskTest {
    public static void main(String[] args) {
        ExchangeDesk ex = new ExchangeDesk();
        Ron lei = new Ron(1_000);
        Eur euro = ex.convert(lei, Eur.class, 0.21);

        System.out.println(euro);
    }
}