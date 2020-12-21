package code._4_student_effort;

public class ExchangeDesk {

    <T1 extends Currency, T2 extends Currency> T1 Convert(T2 mainCurrency, Class<T1> toClass, double  rate){
        T1 toCurrency = null;
        try{
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            toCurrency.setUnits(mainCurrency.getUnits()*rate);
        }catch(Exception e){
            throw  new NewException(e.getMessage());
        }
        return toCurrency;
    }

    public static void main(String[] args) {
       ExchangeDesk ED = new ExchangeDesk();
       RON lei = new RON(1_000);
       USD dollar = ED.Convert(lei, USD.class,3.14);
       System.out.println(dollar);
    }
}
