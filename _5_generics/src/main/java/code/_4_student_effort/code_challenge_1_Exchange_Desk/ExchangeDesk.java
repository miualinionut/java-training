package code._4_student_effort.code_challenge_1_Exchange_Desk;

public class ExchangeDesk {

    <FROM extends Currency, TO extends Currency> TO convert(FROM valueToBeExchanged, Class<TO> convertTo, double rate){
        TO valToReturn;
        try {
            valToReturn = convertTo.getDeclaredConstructor().newInstance();
            valToReturn.setUnits(valueToBeExchanged.getUnits() * rate);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return valToReturn;
    }
}
