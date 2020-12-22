package code._4_student_effort;

public class Exchange {

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        RON lei = new RON(1000);
        USD dollars = exchange.convertStaticRate(lei, USD.class);
        System.out.println(dollars.getValue());

    }

    <T1 extends  Currency, T2 extends Currency> T2 convertStaticRate (T1 originCurr, Class<T2> destinationCurr){
        double rate = 4.5;
        T2 auxCurr = null;
        auxCurr.setValue(originCurr.getValue()*rate);
        return auxCurr;
    }

    <T1 extends  Currency, T2 extends Currency> T2 convert (T1 originCurr, Class<T2> destinationCurr, double rate){
        T2 auxCurr = null;
        auxCurr.setValue(originCurr.getValue()*rate);
        return auxCurr;
    }

}
