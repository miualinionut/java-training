package code._4_student_effort.CodeChallange1;

public class ExchangeDesk {
    private double rate = 1;
    private Class toClass;

    public <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toClass){
        T toCurrency = null;
        try {
            toCurrency = toClass.getDeclaredConstructor().newInstance();
            if(rate != 1) {
                if (this.toClass.equals(toClass)) {
                    toCurrency.setValue(fromCurrency.getValue() * rate);
                } else {
                    toCurrency.setValue(fromCurrency.getValue() / rate);
                }
            }
            else {
                toCurrency.setValue(fromCurrency.getValue());
            }
        } catch (Exception e){
            System.out.println("Conversion failed!");
        }
        return toCurrency;
    }

    public <T extends Currency, F extends Currency> void addRate(Class<F> fromClass, Class<T> toClass, double rate){
        this.rate = rate;
        this.toClass = toClass;
    }
}
