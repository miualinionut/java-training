package clean.code.design_patterns.requirements;

public class PayPal implements PaymentMethod{
    @Override
    public void paySalary(float amount,Employee e) {
        System.out.println("Employee "+e.getID()+" has received its salary ("+amount+") by using the Payment Method: PayPal");
    }
}
