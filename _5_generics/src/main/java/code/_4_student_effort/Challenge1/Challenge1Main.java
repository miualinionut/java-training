package code._4_student_effort.Challenge1;

public class Challenge1Main {

    public static void main(String[] args) {

        ExchangeDesk exchangeDesk=new ExchangeDesk();
        RON bani=new RON(100);
        USD dolari= exchangeDesk.convert(bani,USD.class,(float)(1/4.38));
        System.out.println(dolari);

    }

}
