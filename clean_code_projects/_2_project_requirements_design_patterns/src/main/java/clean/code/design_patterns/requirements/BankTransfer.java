package clean.code.design_patterns.requirements;

public class BankTransfer implements PaymentMethod {
    @Override
    public void paySalary(float amount,Employee e) {
        System.out.println("Employee "+e.getID()+" has received its salary ("+amount+") by using the Payment Method: Bank Transfer");
    }

}
